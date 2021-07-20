package com.github.actor168.designpattern.structure.bridge;

public class PavedRoad extends Road {

    public PavedRoad(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void driveOnRoad() {
        super.vehicle.drive();
        System.out.println("行驶在非石子路");        
    }
    
}
