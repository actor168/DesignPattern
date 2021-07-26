package com.github.actor168.designpattern.creational.factorymethod;

public class OrcWapen implements Wapen{
    
    private WapenType type;

    public OrcWapen(WapenType type) {
         this.type = type;
    }

    @Override
    public WapenType getWapenType() {
        return type;
    }
    
    @Override
    public String toString() {
        return type.name();
    }
}
