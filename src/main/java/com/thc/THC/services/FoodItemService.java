package com.thc.THC.services;

import com.thc.THC.models.FoodItem;

public interface FoodItemService {

    boolean addFoodItem(FoodItem foodItem);
    boolean removeFoodItem(Long id);
}
