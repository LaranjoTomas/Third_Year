function shingles = createShingles(str, shingleSize)
    % Initialize an empty cell array to store the shingles
    shingles = cell(length(str) - shingleSize + 1, 1);
    
    % For each starting position in the string
    for i = 1:length(str) - shingleSize + 1
        % Extract the shingle and store it in the cell array
        shingles{i} = str(i:i + shingleSize - 1);
    end
end