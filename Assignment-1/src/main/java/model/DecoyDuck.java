package model;

import repository.*;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public String display() {
        return "I'm a decoy duck";
    }
}
