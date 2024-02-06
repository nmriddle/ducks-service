package com.example.ducksservice.model;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    private int id;
    private Type type;

    public Duck(int id, Type type) {
        this.id = id;
        this.type = type;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void swim() {

    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
