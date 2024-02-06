package com.example.ducksservice.model;

public class DecoyDuck extends Duck {

    public DecoyDuck(int id) {
        super(id, Type.DECOY_DUCK);
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("im fake");
    }
}
