package com.company;

import com.company.pizza.Pizza;
import com.company.store.NYPizzaStore;
import com.company.store.PizzaStore;

public class Main {

    public static void main(String[] args) {


        PizzaStore ps = new NYPizzaStore();
        Pizza pizza = ps.orderPizza("cheese");
        pizza.toString();
        System.out.println( pizza.toString());
    }
}
