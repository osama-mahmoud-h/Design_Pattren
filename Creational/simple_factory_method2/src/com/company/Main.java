package com.company;

import com.company.pizzaFactory.PizzaFactory;
import com.company.pizza.Pizza;
import com.company.pizzaFactory.SimpleNYPizzaFactory;

public class Main {

    public static void main(String[] args) {

        PizzaFactory simpleFactory = new SimpleNYPizzaFactory();
      //  PizzaFactory randomFactory = new RandomPizzaFactory();

        PizzaStore ps = new PizzaStore(simpleFactory);
        Pizza pizza = null;
        pizza = ps.orderPizza("clam");

        System.out.println(pizza);
        System.out.println("-------------------------------------------------------");
/*
        PizzaStore ps2 = new PizzaStore(randomFactory);
        Pizza pizza2 = null;
        pizza2 = ps2.orderPizza("");
        System.out.println(pizza2);*/


    }
}
