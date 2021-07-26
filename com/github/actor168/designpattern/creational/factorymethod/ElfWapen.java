package com.github.actor168.designpattern.creational.factorymethod;

public class ElfWapen implements Wapen{

    private WapenType type;

    public ElfWapen(WapenType type) {
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
