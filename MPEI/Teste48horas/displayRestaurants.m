function displayRestaurants(restaurantIds, rest)
    for i = 1:length(restaurantIds)
        id = restaurantIds(i);
        fprintf('ID %d: %s - Location: %s\n', id, rest{id, 2}, rest{id, 3});
    end
end