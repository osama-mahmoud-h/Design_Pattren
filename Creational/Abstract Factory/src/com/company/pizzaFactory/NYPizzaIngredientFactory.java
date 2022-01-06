package com.company.pizzaFactory;

import com.company.Ingredients.*;

/**
 * Created by osama on 1/6/22.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(),new Onion()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {

        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {

        return new FreshClams();
    }
}
