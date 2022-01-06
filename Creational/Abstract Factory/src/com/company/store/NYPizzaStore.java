package com.company.store;

import com.company.pizza.*;
import com.company.pizzaFactory.NYPizzaIngredientFactory;
import com.company.pizzaFactory.PizzaIngredientFactory;

/**
 * Created by osama on 1/6/22.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String... type) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if(type.length == 0)
            return null;

        if(type[0].equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New york style cheese pizza");

        }
        else if(type[0].equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New york style clam pizza");
        }

        else
            return null;
        return  pizza;
    }
}
