package com.github.actor168.designpattern.structure.adaptor;

public class CarAdaptor extends RunningCar {
    private Car ccar;

    public void adapt(Car car) {
        this.ccar = car;
    }
    public void change() {
        this.ccar.doors();
        this.ccar.wheels();
        System.out.println("has roof");        
    }

}
