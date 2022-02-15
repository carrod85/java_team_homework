package ee.taltech.b_practise.assignment2;

import java.awt.*;

public class Tiger {

    //todo A add 2 instance fields to this class of different(!) Java types
    Integer weight;
    String color;
    //todo B add a constructor which initializes both of the fields

    public Tiger(Integer weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    //todo C add 2 instance methods to this class (other than getters or setters)
    public void tigerWeight(){
        System.out.println("This is the tiger's weight: " + weight + "kg");
    }

    public void amazingTiger(){
        System.out.println("I've never seen a tiger in " + color + " color");
    }

    public static void main(String[] args) {
        //todo D create a new instance of this class (Tiger)
        Tiger tiger = new Tiger(80, "gray");
        //todo E call 2 of your newly created methods
        tiger.tigerWeight();
        tiger.amazingTiger();
    }
}
