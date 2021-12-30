package com.thc.THC.services.Impl;

import com.thc.THC.models.FoodItem;
import com.thc.THC.repository.FoodItemRepository;
import com.thc.THC.services.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultFoodItemService implements FoodItemService {

    @Autowired
    private FoodItemRepository foodItemRepository;

    public DefaultFoodItemService(FoodItemRepository foodItemRepository) {
        this.foodItemRepository = foodItemRepository;
    }

    @Override
    public boolean addFoodItem(FoodItem foodItem) {
        foodItemRepository.save(foodItem);
        return true;
    }

    @Override
    public boolean removeFoodItem(Long id) {
        foodItemRepository.deleteById(id);
        return true;
    }
}
