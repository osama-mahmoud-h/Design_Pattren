package com.company;

/**
 * Created by osama on 1/9/22.
 */
public class MozzarillaDecorator extends ToppingsDecorator {

    private double cost = 1.5;
    private String decription = " + mozzarilla ";
    private  IPizza tempPizza;
    public MozzarillaDecorator(IPizza pizza) {
        super(pizza);
        tempPizza = pizza;
        //update price
        tempPizza.setCost(tempPizza.getCost()+this.cost);
        //update decribtion
        tempPizza.setDescription(tempPizza.getDescribtion()+this.decription);
    }

    public IPizza getMozzarillaDecorated(){
        return  tempPizza;
    }
}
