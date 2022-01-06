package com.company.pizzaFactory;

import com.company.pizza.Pizza;

/**
 * Created by osama on 1/5/22.
 */
public class SimpleChicagoPizzaFactory implements  PizzaFactory{
    public SimpleChicagoPizzaFactory() {
    }

    @Override
    public Pizza CreatePizza(String... type) {
        return null;
    }
}
