package com.github.actor168.designpattern.structure.decrator;

public class DataSourceDecorator implements DataSource {

    private DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource2) {
        this.dataSource = dataSource2;
    }

    @Override
    public void read() {
        dataSource.read();
    }

    @Override
    public void write() {
        dataSource.write();
    }
    
}
