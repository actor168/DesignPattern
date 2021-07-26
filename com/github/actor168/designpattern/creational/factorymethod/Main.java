package com.github.actor168.designpattern.creational.factorymethod;

/**
 * 工厂方法：使用一个基类方法或接口方法实现将一个对象的创建委托给具体的实现
 * 
 * 典型用例：
 *  Calendar
 *  ResourceBundle
 */
public class Main {
    public static void main(String[] args) {
        Manufactor m = new ElfManufactor();
        Wapen w = m.manufact(WapenType.ELF);
        System.out.println(w);
        w = m.manufact(WapenType.ORC);
        System.out.println(w);

        m = new OrcManufactor();
        w = m.manufact(WapenType.ELF);
        System.out.println(w);
        w = m.manufact(WapenType.ORC);
        System.out.println(w);

    }
}
