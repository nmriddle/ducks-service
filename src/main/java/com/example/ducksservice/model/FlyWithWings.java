package com.example.ducksservice.model;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("flap flap");
    }
}
