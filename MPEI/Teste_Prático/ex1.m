disp("a)");
%   1    2      3      4      5
T =[0    0      0.9    0      0;
    1    0      0      0      0;
    0    0.8    0      0      0; 
    0    0.2    0      1      0;
    0    0      0.1    0      1;];

%Q = T(1:4,1:4);
%F = inv(eye(length(Q))-Q);
disp(T);

disp("b)");

V0 = [0 1 0 0 0];

T9 = T.^9 * V0';

fprintf("A probabilidade de partindo do estado 2 voltar ao estado 2 ao fim de 9 iterações é: %f\n", T9(2));

disp("c)");

%sabendo que o estado inicial foi o 2, determine o número médio de iterações antes de antigir o estado absorvente

Q = T(1:3, 1:3);

I = eye(size(Q, 1));

% Matriz fundamental F
F = inv(I - Q);

% Número médio de iterações
iteracoes = sum(F(2, :));

fprintf("O número médio de iterações antes de atingir um estado absorvente é: %f\n", iteracoes);

disp("d)");

%sabendo que o estado inicial foi o 2, determine a probabilidade de a  absorção se dar no estado 5
% Extract R from T
R = T(1:3, 4:5);

% Calculate FR
FR = F * R;

% The probability of absorption in state 5 given that the initial state was 2
prob = FR(2, 2);

fprintf("A probabilidade de absorção no estado 5 é: %f\n", prob);