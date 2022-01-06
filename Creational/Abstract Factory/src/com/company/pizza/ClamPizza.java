package com.company.pizza;

import com.company.pizzaFactory.PizzaIngredientFactory;

/**
 * Created by osama on 1/6/22.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {

        this.ingredientFactory = ingredientFactory;
        prepare();
    }

    @Override
    void prepare() {
        System.out.println("preparing "+getName());
        dough=ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
        cheese=ingredientFactory.createCheese();
    }
}
