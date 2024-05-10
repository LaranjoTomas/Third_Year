function similarityList = calculateSimilarities(selectedSignature, minHashSignatures, userVisitedRestaurants, selectedRestaurantId)
    similarityList = zeros(size(minHashSignatures, 1), 1);

    for j = 1:size(minHashSignatures, 1)
        if j == selectedRestaurantId || ismember(j, userVisitedRestaurants)
            continue;
        end
        similarityList(j) = calculateSimilarity(selectedSignature, minHashSignatures(j, :));
    end
end