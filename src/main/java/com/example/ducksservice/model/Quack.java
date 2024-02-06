package com.example.ducksservice.model;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
