package com.github.actor168.designpattern.structure.decrator;

public class Main {
    public static void main(String[] args) {
        DataSourceDecorator decorator = new CompressDataSourceDecorator(new FileDataSource());
        decorator.read();
    }
}
