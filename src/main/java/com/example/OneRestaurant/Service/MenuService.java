package com.example.OneRestaurant.Service;


import com.example.OneRestaurant.Repository.MenuList;
import com.example.OneRestaurant.Repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuService {
    @Autowired
    MenuRepository menuRepository;

    public List<MenuList> findAllMenuItems() {
        return menuRepository.findAll();
    }

    public MenuService(MenuRepository menuRepository) {

        this.menuRepository = menuRepository;
    }

    public MenuList findMenuListByName(String name) {

        return menuRepository.findByName(name);
    }

    public MenuList createMenuList(MenuList menuList) {

        return menuRepository.save(menuList);
    }

    public MenuList updateMenuList(MenuList menuList) {

        return menuRepository.save(menuList);
    }

    public void deleteMenuList(Integer id) {

        menuRepository.deleteById(id);
    }
}

