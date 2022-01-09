package com.company;

public class Main {

    public static void main(String[] args) {

        IPizza pizza = new PlainPizza();
        ToppingsDecorator decorator = new MozzarillaDecorator(pizza);

        System.out.println(pizza.getDescribtion());

    }
}
