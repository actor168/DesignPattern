package com.github.actor168.designpattern.structure.adaptor;

public class RunningCar implements Car {

    @Override
    public void wheels() {
        System.out.println("4 wheels");        
    }

    @Override
    public void doors() {
        System.out.println("normal doors");        
    }

    @Override
    public void roof() {
        System.out.println("no roof");        
    }
    
}
