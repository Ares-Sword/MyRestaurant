package com.example.OneRestaurant.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {
    @GetMapping("/")
    public String Index(){
        return "index";
    }
}
