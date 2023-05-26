package org.java.pizzeria;

import java.util.List;

import org.java.pizzeria.pojo.Pizza;
import org.java.pizzeria.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner{
	
	@Autowired
	private PizzaService pizzaService;

	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pizza p = new Pizza("Tonno e cipolla","Molto buona","www.ciao.com",10);
		System.out.println(p);
		
		pizzaService.save(p);
		
		
		List<Pizza> pizzas=pizzaService.findAll();
		System.out.println(pizzas);
	}

}
