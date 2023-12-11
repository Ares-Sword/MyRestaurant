package com.example.OneRestaurant;

import com.example.OneRestaurant.Repository.MenuList;
import com.example.OneRestaurant.Repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneRestaurantApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(OneRestaurantApplication.class, args);

	}
	@Autowired
	private MenuRepository menuRepository;
	@Override
	public void run(String... args) throws Exception {
		MenuList product1 = new MenuList();

		product1.setName("product 1");
		product1.setPrice(2.0);
		MenuList product2 = new MenuList();

		product2.setName("product 2");
		product2.setPrice(5.0);
		MenuList product3 = new MenuList();

		product3.setName("product 3");
		product3.setPrice(4.0);
		MenuList product4 = new MenuList();

		product4.setName("product 4");
		product4.setPrice(4.2);
		MenuList product5 = new MenuList();

		product5.setName("product 5");
		product5.setPrice(2.4);
		MenuList product6 = new MenuList();

		product6.setName("product 6");
		product6.setPrice(23.0);
		MenuList product7 = new MenuList();

		product7.setName("product 7");
		product7.setPrice(23.0);
		MenuList product8 = new MenuList();

		product8.setName("product 8");
		product8.setPrice(22.0);
		MenuList product9 = new MenuList();

		product9.setName("product 9");
		product9.setPrice(22.0);
		MenuList product10 = new MenuList();

		product10.setName("product 10");
		product10.setPrice(12.0);

		menuRepository.save(product1);
		menuRepository.save(product2);
		menuRepository.save(product3);
		menuRepository.save(product4);
		menuRepository.save(product5);
		menuRepository.save(product6);
		menuRepository.save(product7);
		menuRepository.save(product8);
		menuRepository.save(product9);
		menuRepository.save(product10);


	}

}
