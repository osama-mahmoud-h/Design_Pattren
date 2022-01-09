package com.company;

/**
 * Created by osama on 1/9/22.
 */
public abstract class ToppingsDecorator {

    IPizza tempPizza;

    public ToppingsDecorator(IPizza pizza){
        this.tempPizza=pizza;
    }

}
