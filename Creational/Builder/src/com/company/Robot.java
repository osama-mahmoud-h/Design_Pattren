package com.company;

/**
 * Created by osama on 1/6/22.
 */
public class Robot {

    int id;
    static int idCounter=0;
    String type;
    int price;
    String headType;
    String bodyType;
    String legsType;


    private Robot(String type, int price, String headType, String bodyType, String legsType) {
        idCounter++;
        this.id=idCounter;
        this.type = type;
        this.price = price;
        this.headType = headType ;
        this.bodyType = bodyType;
        this.legsType=legsType;
        System.out.println("Robot parametarized constructor");
    }

    public static  class RobotBuilder {
        String type;
        int price;
        String headType;
        String bodyType;
        String legsType;

        public RobotBuilder() {

        }

        public RobotBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public RobotBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public RobotBuilder setHeadType(String headType) {
            this.headType = headType;
            return this;
        }

        public RobotBuilder setBodyType(String bodyType) {
            this.bodyType = bodyType;
            return this;
        }

        public RobotBuilder setLegsType(String legsType) {
            this.legsType = legsType;
            return this;
        }
        public Robot build(){
            if(type == null)
                throw  new IllegalArgumentException();
            if(price == 0)
                throw  new IllegalArgumentException();
            if(headType == null)
                throw  new IllegalArgumentException();
            if(bodyType == null)
                throw  new IllegalArgumentException();
            if(legsType == null)
                throw  new IllegalArgumentException();

            return new Robot( this.type,  this.price,  this.headType,  this.bodyType,  this.legsType);
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", headType='" + headType + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", LegsType='" + legsType + '\'' +
                '}';
    }
}
