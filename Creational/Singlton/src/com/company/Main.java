package com.company;

public class Main {

    public static void main(String[] args) {


        Singleton s1 = Singleton.getInsstance();
        Singleton s2 = Singleton.getInsstance();


            System.out.println(s1==s2);
    }
}
