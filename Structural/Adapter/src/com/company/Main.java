package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);


        List<Duck> ducks = new ArrayList<>();

        ducks.add(new MallardDuck());

        ducks.add(turkeyAdapter);

        for(Duck _duck : ducks){
            _duck.fly();
            _duck.quack();
        }

    }
}
