package com.company;

import java.util.Random;

public class RandomPizzaFactory implements PizzaFactory{
    @Override
    public Pizza CreatePizza(String... type) {
        Random random = new Random();
        Pizza pizza = null;
        int rand = random.nextInt(10)+1; // random numbers from 1 to 10

        if(rand==1)
            pizza = new ClamPizza();
        else if(rand==5)
            pizza = new PepperoniPizza();
        else
            pizza = new VeggiePizza();

        return pizza;
    }
}
