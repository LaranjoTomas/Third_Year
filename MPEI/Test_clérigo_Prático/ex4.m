% EXERCÍCIO 4
% Considere as 2 funções no fim deste script que implementam duas das
% funcionalidades necessárias à implementação de um filtro de Bloom.
% Considere também os dois conjuntos de chaves seguintes:

CH1= {'Amelia','Emma','Damian','Joe','Madison','Megan','Susan','Thomas'};
CH2= {'George','Jack','Oscar','Sarah'};

% (a) (3.0 valores) Desenvolva a função que falta para, com as funções
%     fornecidas, ter todas as funcionalidades necessárias à implementação
%     de um filtro de Bloom.
% (b) (2.0 valores) Desenvolva um script que (i) crie um filtro de Bloom
%     de comprimento 100 baseado em 6 funções de dispersão com as
%     chaves de CH1, (ii) teste a pertença das chaves de CH1 no filtro de
%     Bloom criado e (iii) verifique se as chaves de CH2 pertencem ao
%     filtro de Bloom.

disp("b)");
disp("I)");

k = 6;
n = 100;

BloomFiler = BloomInit(n);

for i = 1:length(CH1)
    BloomFiler = AddElement(BloomFiler, CH1{i}, k);
    fprintf("Inseriu %s\n", CH1{i});
end

disp("II)");
for i = 1:length(CH1)
    if BloomVerify(BloomFiler, CH1{i}, k)
        fprintf("%s pertence ao BloomFilter\n", CH1{i});
    else
        fprintf("%s não pertence ao BloomFilter\n", CH1{i});
    end
end

disp("III)");
for i = 1:length(CH2)
    if BloomVerify(BloomFiler, CH2{i}, k)
        fprintf("%s pertence ao BloomFilter\n", CH2{i});
    else
        fprintf("%s não pertence ao BloomFilter\n", CH2{i});
    end
end


