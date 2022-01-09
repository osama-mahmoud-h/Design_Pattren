package com.company;

/**
 * Created by osama on 1/9/22.
 */
public class OlivesDecorator {
  private double cost = 0.5;
    private String decription = " + olvies ";
    private  IPizza tempPizza;
    public MozzarillaDecorator(IPizza pizza) {
        super(pizza);
        tempPizza = pizza;
        //update price
        tempPizza.setCost(tempPizza.getCost()+this.cost);
        //update decribtion
        tempPizza.setDescription(tempPizza.getDescribtion()+this.decription);
    }

}
