package com.github.actor168.designpattern.structure.delegation;

public class PrinterController {
    private Printer printer;

    public PrinterController(Printer p) {
        this.printer = p;
    }

    public void print() {
        printer.print();
    }
}
