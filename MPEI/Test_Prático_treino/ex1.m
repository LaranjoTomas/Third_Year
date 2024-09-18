% a)
disp("a)");

a1 = 0.2;
a5 = 0.3;
a3 = 0.1;
a4 = 0.45;
%   1    5      3    4      2      meta 
T =[0    0      0    0      0       0;
    1-a1 0      1-a3 0      1       0;
    0    a5     0    a4     0       0;
    0    1-a5   a3   0      0       0;
    a1   0      0    0      0       0;
    0    0      0    1-a4   0       1;];
%   1    5      3    4      2      meta

Q = T(1:5,1:5); % Q = matriz de transição sem a meta
F = inv(eye(length(Q))-Q); % F = (I-Q)^-1
disp(F);

% b)
disp("b)");

N = 1e6; % numero de testes
Sum = 0; % numero de vezes que o jogador segue o percurso mais pequeno

for n = 1:N
    state = crawl(T,1,6); % percurso do teste, devolve uma lista
    if length(state) == 4
        Sum = Sum + 1;
    end
end

disp("A probabilidade de o jogador seguir o percurso mais pequeno é: " + Sum/N);

% c)
disp("c)");

Sum = 0;
for n = 1:N
    state = crawl(T,1,6); % percurso do teste, devolve uma lista
    Sum = Sum + length(state); % numero de casas percorridas
end

disp("O numero médio de casas percorridas é: " + Sum/N);

