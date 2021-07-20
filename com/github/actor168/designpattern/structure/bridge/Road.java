package com.github.actor168.designpattern.structure.bridge;

public abstract class Road {
    protected Vehicle vehicle;

    public Road(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract void driveOnRoad();
 }
