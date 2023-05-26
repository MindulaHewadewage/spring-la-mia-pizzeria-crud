package org.java.pizzeria.serv;

import java.util.List;

import org.java.pizzeria.pojo.Pizza;
import org.java.pizzeria.repo.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PizzaService {
	@Autowired
	private PizzaRepo pizzaRepo;
	
	public List<Pizza>findAll(){
		return pizzaRepo.findAll();
	}
	
	public Pizza save(Pizza pizza) {
		return pizzaRepo.save(pizza);
	}
}
