package com.company;

/**
 * Created by osama on 1/8/22.
 */
public class Singleton {

    private static Singleton insstance = null;
    private Singleton(){

    }

    public static Singleton getInsstance() {
        if(insstance == null)
            insstance = new Singleton();
        return insstance;
    }


}
