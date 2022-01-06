package com.company.pizza;

import com.company.Ingredients.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name ;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public  Pizza(){

    }

    public String getName(){
        return  this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    abstract void prepare();

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

        if(name!=null) info.append("name: " + name);
        if(dough!=null)  info.append("\ndough: " + dough.toString());
        if(sauce!=null)  info.append("\nsauce: " + sauce.toString());
        if(cheese!=null)   info.append("\ncheese: " + cheese.toString());
        if(pepperoni!=null)  info.append("\npepperoni: " + pepperoni.toString());
        if(clam!=null)  info.append("\nclam: " + clam.toString());

        if(veggies!=null) {
            info.append("\nVeggies: [");
            for (Veggies veggie : veggies) {
                info.append(veggie.toString() + " , ");
            }
            info.append("]");
        }
      return  info.toString();
    }
}
