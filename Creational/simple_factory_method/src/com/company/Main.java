package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        PizzaFactory simpleFactory = new SimplePizzaFactory();
        PizzaFactory randomFactory = new RandomPizzaFactory();

        PizzaStore ps = new PizzaStore(simpleFactory);
        Pizza pizza = null;
        pizza = ps.orderPizza("clam");

        System.out.println("-------------------------------------------------------");

        PizzaStore ps2 = new PizzaStore(randomFactory);
        Pizza pizza2 = null;
        pizza2 = ps2.orderPizza("");
        System.out.println(pizza2);


    }
    public static void x(String... y){
        System.out.println(y[0]);
    }
}
