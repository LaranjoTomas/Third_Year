n = 300;
k = 3;

disp("a)");

% determina a dimensão do universo de pessoas contindo no cell array names e determine tambem o numero de pessoas com o nome paolo
%o ficheiro names.mat contem dois cell arrays, um com o nome names que contem os nomes próprios e outro com o nome test que contèm nomes proprios não existentes no primeiro cell array

data = load('data.mat');
names = data.names;
dim = numel(names);
count = 0;
for i = 1:dim
    if strcmpi(names{i}, "Paolo")
        count = count + 1;
    end
end
fprintf("Dimensão do universo de pessoas: %d\n", dim);
fprintf("Numero de pessoas com o nome paolo: %d\n", count);

%crie o filtro de bloom com contagem e adicione os nomes do universo de pessoas contido no cell array names
% finalemnte determine quantas pessoas com o nome paolo são indicadas pelo filtro criado

Bloom = BloomInit(n);
for i = 1:dim
    Bloom = BloomInsert(Bloom, names{i}, k);
end

count = 0;
for i = 1:dim
    if strcmpi(names{i}, 'paolo') && BloomVerify(Bloom, names{i}, k)
        count = count + 1;
    end
end
fprintf("Numero de pessoas com o nome paolo (Bloom filter): %d\n", count);

disp("b)");

test = data.test;
dim_test = numel(test);

counts = zeros(1, 4); % Array to store the counts for 0, 1, 2, and 3 or more

% Run the simulation
for i = 1:dim_test
    count = 0;
    for j = 1:dim
        if BloomVerify(Bloom, test{j}, k)
            count = count + 1;
        end
    end

    % Update the counts array
    if count >= 3
        counts(4) = counts(4) + 1;
    elseif count == 2
        counts(3) = counts(3) + 1;
    elseif count == 1
        counts(2) = counts(2) + 1;
    else
        counts(1) = counts(1) + 1;
    end
end

% Calculate the probabilities
probs = counts / dim_test;

fprintf("Probabilidade de 0 pessoas com nome existente: %.5f\n", probs(1));
fprintf("Probabilidade de 1 pessoas com nome existente: %.5f\n", probs(2));
fprintf("Probabilidade de 2 pessoas com nome existente: %.5f\n", probs(3));
fprintf("Probabilidade de 3 ou mais pessoas com nome existente: %.5f\n", probs(4));

