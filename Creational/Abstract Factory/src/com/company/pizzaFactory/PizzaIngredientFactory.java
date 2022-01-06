package com.company.pizzaFactory;

import com.company.Ingredients.*;

/**
 * Created by osama on 1/6/22.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies []createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();

}
