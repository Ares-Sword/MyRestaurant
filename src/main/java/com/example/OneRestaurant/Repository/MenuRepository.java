package com.example.OneRestaurant.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends CrudRepository<MenuList,Integer> {
    MenuList findByName(String name);
    List<MenuList> findAll();

}

