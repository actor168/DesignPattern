package com.github.actor168.designpattern.creational.factorymethod;

public class OrcManufactor implements Manufactor {

    @Override
    public Wapen manufact(WapenType type) {
        return new OrcWapen(WapenType.ORC);
    }
    
}
