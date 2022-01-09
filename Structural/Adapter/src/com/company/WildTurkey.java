package com.company;

/**
 * Created by osama on 1/9/22.
 */
public class WildTurkey implements  Turkey{
    @Override
    public void gobble() {
        System.out.println("Globbling");
    }

    @Override
    public void fly() {
        System.out.println("iam flying for short distance");
    }
}
