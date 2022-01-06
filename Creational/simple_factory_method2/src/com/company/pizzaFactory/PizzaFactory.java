package com.company.pizzaFactory;

import com.company.pizza.Pizza;

public interface PizzaFactory {
    public Pizza CreatePizza(String... type);
}
