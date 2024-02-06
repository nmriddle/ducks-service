package com.example.ducksservice.model;

public class RubberDuck extends Duck {

    public RubberDuck(int id) {
        super(id, Type.RUBBER_DUCK);
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("im rubber");
    }
}
