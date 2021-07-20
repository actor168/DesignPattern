package com.github.actor168.designpattern.structure.bridge;

public class Bus implements Vehicle {

    @Override
    public void drive() {
        System.out.println("bus...");        
    }
    
}
