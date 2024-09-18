function value = IsMember(B,key,k)
    % B -> Bloom Filter
    % key -> key to be searched

    m = length(B);
    res = true;

    for i = 1:k
        key = [key num2str(i)];
        h = string2hash(key);    % Aplicação da função hash
        h = rem(h,m) + 1;  % Para conseguir utilizar o valor do hash no bloom filter, adicionar 1 pois as posições em matlab começam a 1
        
        if B(h) == false
            res = false;
            break
        end
    end
end