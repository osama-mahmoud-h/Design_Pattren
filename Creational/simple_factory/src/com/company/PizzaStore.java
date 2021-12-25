package com.company;

import java.util.List;

public  class PizzaStore {

    private PizzaFactory factory = null;

    public PizzaStore(PizzaFactory factory) {

        this.factory = factory;
    }
    public Pizza orderPizza(String... type){
        Pizza pizza = factory.CreatePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return  pizza;
    }
}
