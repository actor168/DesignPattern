package com.github.actor168.designpattern.structure.delegation;

/**
 * 委托：将一个行为委托给其他的实现类
 */
public class Main {
    public static void main(String[] args) {
        PrinterController c = new PrinterController(new EpsonPrinter());
        c.print();
    }
}
