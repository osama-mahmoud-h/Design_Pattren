package com.company;

/**
 * Created by osama on 1/9/22.
 */
public class PlainPizza implements IPizza {

    double cost;
    String description;

    public PlainPizza() {
        this.cost = 10.0;
        this.description = "thin dough";
    }

    @Override
    public String getDescribtion() {
        return this.description;
    }

    @Override
    public double getCost() {
        return this.cost;
    }
    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }
    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
