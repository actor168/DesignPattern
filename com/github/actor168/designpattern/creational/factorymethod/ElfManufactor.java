package com.github.actor168.designpattern.creational.factorymethod;

public class ElfManufactor implements Manufactor {

    @Override
    public Wapen manufact(WapenType type) {
        return new OrcWapen(WapenType.ELF);
    }
    
}
