package com.company.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name,
            dough,
            sauce;
    List<String> toppings;

    public  Pizza(){
        toppings = new ArrayList<>();
    }

    public String getName(){
        return  this.name;
    }
    public void prepare(){
        System.out.println("preparing");
    }
    public void bake(){
        System.out.println("baking ");
    }
    public  void cut(){
        System.out.println("cutting");
    }
    public void box(){
        System.out.println("boxing ");
    }

    @Override
    public String toString() {

        StringBuilder info = new StringBuilder();
        info.append("name: " + name);
        info.append("\ndough: " + dough);
        info.append("\nsauce: " + sauce);
        info.append("\ntoppings: [");

        for (String topping : toppings) {
            info.append( topping+" , ");
        }
        info.append("]");
      return  info.toString();
    }
}
