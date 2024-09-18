function signature = minHash(shingleSet, numHashFunctions)
    % Initialize the signature with infinity
    signature = inf(numHashFunctions, 1);
    
    % Define the hash functions
    hashFunctions = randi(intmax, numHashFunctions, 2);
    
    % For each shingle in the set
    for j = 1:length(shingleSet)
        % Convert the shingle to a number
        shingle = shingleSet{j};
        shingleNum = sum(double(shingle));
        
        % For each hash function
        for i = 1:numHashFunctions
            % Calculate the hash value
            hashValue = mod(hashFunctions(i, 1) * shingleNum + hashFunctions(i, 2), double(intmax));
            
            % Update the signature if the hash value is smaller
            if hashValue < signature(i)
                signature(i) = hashValue;
            end
        end
    end
end