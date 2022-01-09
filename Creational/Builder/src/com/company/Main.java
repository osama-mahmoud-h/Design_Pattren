package com.company;

public class Main {

    public static void main(String[] args) {

        Robot.RobotBuilder robotBuilder = new Robot.RobotBuilder()
                .setType("electric")
                .setPrice(6000)
                .setBodyType("spherecal")
                .setHeadType("spherecal")
                .setLegsType("spherecal");

       Robot robot = robotBuilder.build();


       System.out.println(robot);
    }
}
