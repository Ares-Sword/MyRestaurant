package com.example.OneRestaurant.Controller;

import com.example.OneRestaurant.Repository.MenuList;
import com.example.OneRestaurant.Repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Menu {
    @Autowired
    private MenuRepository menuRepository;
    @GetMapping("/menu")
    public String Menu(Model model) {
        model.addAttribute("MenuList", menuRepository.findAll());
        return "menu";
    }

}
