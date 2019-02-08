package com.cg.annapurna.OrderService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.annapurna.OrderService.entity.Order;
import com.cg.annapurna.OrderService.repository.OrderRepository;

//@EnableDiscoveryClient
@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	/*
	 * @Bean public CommandLineRunner loadData(OrderRepository repository) {
	 * Map<String, Integer> map = new HashMap<String, Integer>();
	 * map.put("product1", 3); return (args) -> { { repository.save(new Order(101,
	 * "COD","Pending", map)); repository.save(new Order(102,"COD", "Delivered",
	 * map)); repository.save(new Order(103, "COD","Pending", map)); }
	 * 
	 * }; }
	 */

}
