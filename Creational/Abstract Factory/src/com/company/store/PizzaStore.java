package com.company.store;

import com.company.pizzaFactory.PizzaFactory;
import com.company.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String... type){
        Pizza pizza = createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.box();
        return  pizza;
    }

    protected  abstract Pizza createPizza(String... type);
}
