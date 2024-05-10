% Load the data
data = readtable('cars.xlsx', 'PreserveVariableNames', true);

% Print the number of cars read from the file
fprintf('Number of cars read from file: %d\n', size(data, 1));

% Convert the categorical data to categories and then to numeric
data_num = varfun(@(x) double(categorical(x)), data(:, 2:end), 'OutputFormat', 'table');

% Convert the data to a binary matrix
data_bin = table2array(data_num);
data_bin = mat2cell(data_bin, ones(size(data_bin, 1), 1), size(data_bin, 2));

% Print the number of cars in the binary matrix
fprintf('Number of cars in binary matrix: %d\n', size(data_bin, 1));


% Define the hash functions
hash_funcs = {@(x) hf24(x, 1), @(x) hf24(x, 2), @(x) hf24(x, 3)};

% Implement MinHash
num_hash_funcs = length(hash_funcs);
signatures = inf(num_hash_funcs, size(data_bin, 1));
for i = 1:size(data_bin, 1)
    for j = 1:num_hash_funcs
        signatures(j, i) = min(hash_funcs{j}(data_bin{i}));
    end
end

% Print the size of the signatures array
fprintf('Size of signatures: %s\n', mat2str(size(signatures)));

% Print the signatures of the cars
for i = 1:size(data_bin, 1)
    fprintf('Signature of car %d: %s\n', i, mat2str(signatures(:, i)));
end

% Calculate the Jaccard distance manually
jaccard_dist = zeros(size(data_bin, 1));
for i = 1:size(data_bin, 1)
    for j = 1:size(data_bin, 1)
        if i ~= j
            intersection = sum(data_bin{i} & data_bin{j});
            union = sum(data_bin{i} | data_bin{j});
            jaccard_dist(i, j) = 1 - (intersection / union);
            fprintf('Jaccard distance between car %d and car %d: %.5f\n', i, j, jaccard_dist(i, j));
        end
    end
end

% Find the pair of cars with the smallest Jaccard distance
min_values = min(jaccard_dist(jaccard_dist>0));
[i, j] = find(jaccard_dist == min(min_values), 1);
fprintf('The most similar pair of cars is %s and %s\n', data.Model{i}, data.Model{j});