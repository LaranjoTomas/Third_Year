% EXERCÍCIO 3
% Considere um conjunto de 4 páginas web (A, B, C e D) com os hyperlinks
% seguintes entre eles:
% A -> B , A -> C , B -> C , C -> D
%
% (3.0 valores) Determine o pagerank de cada página web ao fim de 10
% iterações assumindo beta = 0.8 e resolvendo primeiro problemas que
% possam existir de 'spider traps' e/ou 'dead-ends'.

disp("a)");
%    A   B C D
H = [0   0 0 0;
    1/2  0 0 0;
    1/2  1 0 0;
     0   0 1 0;];

beta = 0.8;

Hsolved = [0   0 0 1/4;
          1/2  0 0 1/4;
          1/2  1 0 1/4;
           0   0 1 1/4];

N = length(H);

A = beta * Hsolved + (1-beta) * ones(N)/N; % matriz google

pagerank = ones(N,1) / N;
iteracoes = 10;

for i = 1:iteracoes
    pagerank = A * pagerank;
end

disp(pagerank);