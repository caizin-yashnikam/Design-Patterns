package model;


import repository.*;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public String display() {
        return "I'm a rubber duck";
    }
}

