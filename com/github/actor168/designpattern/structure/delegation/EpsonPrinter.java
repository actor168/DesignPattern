package com.github.actor168.designpattern.structure.delegation;

public class EpsonPrinter implements Printer{

    @Override
    public void print() {
        System.out.println("epson printer...");        
    }
    
}
