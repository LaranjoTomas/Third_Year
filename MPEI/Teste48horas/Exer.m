udata = load('utilizadores.data');
u = udata(:, 1:2); 
clear udata;

users = unique(u(:, 1));
Nu = length(users);

fprintf('Insert User ID (1 to %d):', Nu);
userID = input('');
if (userID < 1 || userID > 2426) || isnan(userID) 
    disp('Invalid user ID.');
    return;
end

disp('1 - Restaurantes evaluated by you');
disp('2 - Set of restaurants evaluated by the most similar user');
disp('3 - Search special dish');
disp('4 - Find the most similar restaurants');
disp('5 - Estimate the number of evaluations by each tourist');
disp('6 - Exit');
userInput = input('Select choice: ', 's'); 

rest = readcell('restaurantes.txt', 'Delimiter', '\t');

user_data = load('utilizadores.data');

user_restaurants = cell(size(user_data, 1), 2);
for i = 1:size(user_data, 1)
    user_restaurants{i, 1} = num2str(user_data(i, 1));  % User ID
    user_restaurants{i, 2} = user_data(i, 2);  % List of visited restaurant IDs
    user_restaurants{i, 3} = user_data(i, 4);  % List of visited restaurant ratings
end

% rest = ID    Nome  Localidade  concelho    tipo de cozinha   pratos   dias encerrados

while userInput ~= '6' % while the user doesn't want to exit
    switch userInput
        case '1'
            disp('Restaurants evaluated by you:');
            user_indices = find(strcmp(user_restaurants(:, 1), num2str(userID)));
            if isempty(user_indices)
                disp('No matching user ID found.');
            else
                for index = 1:length(user_indices)
                    user_restaurant_ids = user_restaurants{user_indices(index), 2};
                    for i = 1:length(user_restaurant_ids)
                        restaurant_id = user_restaurant_ids(i);
                        restaurant_info = rest(cell2mat(rest(:, 1)) == restaurant_id, :);
                        fprintf('ID: %d, Name: %s, Concelho: %s\n', restaurant_info{1}, restaurant_info{2}, restaurant_info{3});
                    end
                end
            end
            
        case '2' 

            load('data.mat');
           
            signature = signatures_2(:, userID);

            minJaccard = Inf;
            mostSimilarUser = 0;

            for i = 1:size(signatures_2, 2)
                if i ~= userID
                    intersection = sum(signature == signatures_2(:, i));
                    unionSize = numel(unique([signature; signatures_2(:, i)]));
                    jaccard = 1 - (intersection / unionSize);

                    if jaccard < minJaccard
                        minJaccard = jaccard;
                        mostSimilarUser = i;
                    end
                end
            end

            user_indices = find(strcmp(user_restaurants(:, 1), num2str(mostSimilarUser))); 
            if isempty(user_indices)
                disp('No matching user ID found.');
            else
                for index = 1:length(user_indices)
                    user_restaurant_ids = user_restaurants{user_indices(index), 2};
                    for i = 1:length(user_restaurant_ids)
                        restaurant_id = user_restaurant_ids(i);
                        restaurant_info = rest(cell2mat(rest(:, 1)) == restaurant_id, :);
                        fprintf('ID: %d, Name: %s, Concelho: %s\n', restaurant_info{1}, restaurant_info{2}, restaurant_info{3});
                    end
                end
            end

        case '3'
            String = input('Write a string: ', 's');
            shingleSize = 3;
            numHashFunctions = 100;

            StringSet = createShingles(lower(String), shingleSize);

            StringSignature = minHash(StringSet, numHashFunctions);

            jaccard_estimates = zeros(size(rest, 1), 1);

            for i = 1:size(rest, 1)
                RestStringSet = createShingles(lower(rest{i, 5}), shingleSize);
                
                jaccard_estimates(i) = length(intersect(StringSet, RestStringSet)) / length(union(StringSet, RestStringSet));
            end
            
            [sorted_estimates, sorted_indices] = sort(jaccard_estimates, 'descend');

            count = 0;
            for i = 1:length(sorted_indices)
                if sorted_estimates(i) >= 0.01
                    restaurant_info = rest(sorted_indices(i), [1, 2, 3, 5]);
                    fprintf('ID: %d, Name: %s, Localidade: %s, Prato do dia: %s, Jaccard estimate: %.2f\n', restaurant_info{1}, restaurant_info{2}, restaurant_info{3}, restaurant_info{4}, sorted_estimates(i));
                    count = count + 1;
                    if count == 5
                        break;
                    end
                end
            end

            if count == 0
                disp('No restaurants found.');
            end

        case '4'

            minHashSignatures = computeMinHashSignatures(rest);
            disp('Restaurants evaluated by you:');
            user_indices = find(strcmp(user_restaurants(:, 1), num2str(userID)));  % Convert userID to string
            if isempty(user_indices)
                disp('No matching user ID found.');
            else
                for index = 1:length(user_indices)
                    user_restaurant_ids = user_restaurants{user_indices(index), 2};
                    for i = 1:length(user_restaurant_ids)
                        restaurant_id = user_restaurant_ids(i);
                        restaurant_info = rest(cell2mat(rest(:, 1)) == restaurant_id, :);
                        fprintf('ID: %d, Name: %s, Concelho: %s\n', restaurant_info{1}, restaurant_info{2}, restaurant_info{3});
                    end
                end
            end
            userVisitedRestaurants = user_restaurants{userID, 2};
            disp('Choose one of the Restaurants above by ID:');
            selectedRestaurantId = input('');
            if (selectedRestaurantId < 1 || selectedRestaurantId > 1064) || isnan(selectedRestaurantId) 
                disp('Invalid restaurant ID.');
                return;
            end
            
            % Get MinHash signature for the selected restaurant
            selectedSignature = minHashSignatures(selectedRestaurantId, :);
            
            % Calculate similarity and find similar restaurants
            similarityList = calculateSimilarities(selectedSignature, minHashSignatures, userVisitedRestaurants, selectedRestaurantId);
            
            % Sort similarities
            [sortedSimilarities, sortedIndices] = sort(similarityList, 'descend');
            
            % Display top 3 similar restaurants
            fprintf('The 3 most similar restaurants to the selected one (ID %d) are:\n', selectedRestaurantId);
            for k = 1:min(3, sum(sortedSimilarities > 0))  % Display up to 3 similar restaurants
                similarRestaurantId = sortedIndices(k);
                fprintf('ID %d: %s - Similarity: %f\n', similarRestaurantId, rest{similarRestaurantId, 2}, sortedSimilarities(k));
            end
               
        case '5'

            load('data.mat');

            fprintf('Insert User ID (1 to %d (Except: %d) ):', Nu, userID);
            second_userID = input('');
            if (second_userID < 1 || second_userID > 2426) || isnan(second_userID)
                disp('Invalid user ID.');
            elseif second_userID == userID
                disp('Same user ID.');
            else
                for i = 1:size(user_data, 1)
                    if user_data(i, 1) == second_userID
                        restaurant_ids = user_data(i, 2);
                        for j = 1:length(restaurant_ids)
                            hash_position = mod(restaurant_ids(j), bloom_filter_size) + 1;
                            bloom_filter(hash_position) = 1;
                        end
                    end
                end
                
                estimated_visited_count = nnz(bloom_filter);

                fprintf('Estimated number of restaurants visited by %d: %d\n', second_userID, estimated_visited_count);
            end

        otherwise
            disp('Invalid option');
    end
    disp('1 - Restaurantes evaluated by you');
    disp('2 - Set of restaurants evaluated by the most similar user');
    disp('3 - Search special dish');
    disp('4 - Find the most similar restaurants');
    disp('5 - Estimate the number of evaluations by each tourist');
    disp('6 - Exit');
    userInput = input('Select an option: ', 's'); % read the next option
end
