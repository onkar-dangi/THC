package com.thc.THC.services.Impl;

import com.thc.THC.models.FoodItem;
import com.thc.THC.models.Menu;
import com.thc.THC.repository.MenuRepository;
import com.thc.THC.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMenuService implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public DefaultMenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public List<Menu> getMenu() {
        return menuRepository.findAll();
    }

    @Override
    public boolean removeMenu(Long id) {
        menuRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean addMenu(Menu menu) {
        menuRepository.save(menu);
        return true;
    }
}
