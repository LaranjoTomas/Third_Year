function minHashSignatures = computeMinHashSignatures(rest)
    numRestaurants = size(rest, 1);
    numHashFunctions = 100; % Adjust this based on your requirements
    
    minHashSignatures = randi([0, 1], numRestaurants, numHashFunctions);
end