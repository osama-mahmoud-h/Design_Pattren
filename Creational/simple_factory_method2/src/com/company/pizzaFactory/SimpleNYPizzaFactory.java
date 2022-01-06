package com.company.pizzaFactory;

import com.company.pizza.NYPepperoniPizza;
import com.company.pizza.NYStyleCheesePizza;
import com.company.pizza.NYStyleClamPizza;
import com.company.pizza.Pizza;

public class SimpleNYPizzaFactory implements PizzaFactory{

    public SimpleNYPizzaFactory(){

    }

    @Override
    public Pizza CreatePizza(String... type) {
        if(type.length == 0)
            return null;

            Pizza pizza = null;
        if(type[0].equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }
        else if(type[0].equals("clam")){
            pizza = new NYStyleClamPizza();
        }
        else if(type[0].equals("pepperoni")) {
             pizza = new NYPepperoniPizza();
        }
        else
            return null;
        return  pizza;
    }
}