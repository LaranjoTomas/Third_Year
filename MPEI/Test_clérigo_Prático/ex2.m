
% EXERCÍCIO 2
% Considere um sistema com 4 estados (1, 2, 3 e 4) modelado por uma cadeia
% de Markov com a matriz de transição de estados T seguinte.

T= [0.2 0.4 0.1 0;
    0.4 0.3 0.1 0.1;
    0.3 0.3 0.8 0.1;
    0.1 0   0   0.8;];
% (a) (3.0 valores) Qual a probabilidade de o sistema, começando no
%     estado 2, estar no estado 4 após 5 transições?
% (b) (2.0 valores) Qual a probabilidade de o sistema, começando no
%     estado 2, manter-se no estado 2 nas 5 primeiras transições?

disp("a)");

V0 = [0;
      1;
      0;
      0;];

T5 =  T^5 * V0;

disp(T5(4));

disp("b)");

disp(T5(2));