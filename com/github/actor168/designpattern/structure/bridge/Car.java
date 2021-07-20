package com.github.actor168.designpattern.structure.bridge;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("car...");        
    }
    
}
