package com.example.ducksservice.model;

public class MallardDuck extends Duck {
    public MallardDuck(int id) {
        super(id, Type.MALLARD);
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("im a mallard");
    }
}
