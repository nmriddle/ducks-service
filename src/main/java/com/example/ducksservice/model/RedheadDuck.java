package com.example.ducksservice.model;

public class RedheadDuck extends Duck {
    public RedheadDuck(int id) {
        super(id, Type.REDHEAD);
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("my head is red");
    }
}
