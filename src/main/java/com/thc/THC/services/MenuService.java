package com.thc.THC.services;

import com.thc.THC.models.FoodItem;
import com.thc.THC.models.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getMenu();
    boolean removeMenu(Long id);
    boolean addMenu(Menu menu);
}
