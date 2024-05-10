% Load data
udata = load('utilizadores.data');
u = udata(:, 1:2); 
clear udata;

% Identify unique users and number of users
users = unique(u(:, 1));
Nu = length(users);
k = 100;

% Create cell array to store sets for each user
Set = cell(Nu, 1);

% Populate sets for each user
for n = 1:Nu
    ind = find(u(:, 1) == users(n));
    Set{n} = u(ind, 2);
end

% Generate random hash functions
hash_functions = cell(k, 1);
for i = 1:k
    a = randi(1000000);
    b = randi(1000000);
    hash_functions{i} = @(x) mod(a * x + b, 1000000);
end

% Calculate MinHash signatures for option 2
signatures_2 = zeros(k, Nu);
for n = 1:Nu
    for i = 1:k
        % Apply each hash function to each element in the set
        hash_values = arrayfun(hash_functions{i}, Set{n});
        % Find the minimum hash value for each hash function
        signatures_2(i, n) = min(hash_values);
    end
end

% Create bloom filter for option 5
bloom_filter = zeros(1064, 1);

save('data.mat', 'signatures_2', 'bloom_filter');
