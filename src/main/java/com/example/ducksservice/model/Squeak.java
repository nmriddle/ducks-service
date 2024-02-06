package com.example.ducksservice.model;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak squeak");
    }
}
