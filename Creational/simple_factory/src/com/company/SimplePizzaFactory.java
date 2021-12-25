package com.company;

import java.util.ArrayList;
import java.util.List;

public class SimplePizzaFactory implements PizzaFactory{

    public SimplePizzaFactory(){

    }

    @Override
    public Pizza CreatePizza(String... type) {
        if(type.length == 0)
            return null;

            Pizza pizza = null;
        if(type[0].equals("cheese")){
            pizza = new CheesePizza();
        }
        else if(type[0].equals("clam")){
            pizza = new ClamPizza();
        }
        else
            return null;
        return  pizza;
    }
}