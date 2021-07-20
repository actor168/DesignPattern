package com.github.actor168.designpattern.structure.adaptor;

public class Main {
    /**
     * 适配器模式
     * 
     * 概念定义：将一个类的接口转换成用户所期待的接口模式，从而使得因接口不兼容而不能在一起工作的类能在一起工作
     * 
     * 分类：
     *  - 对象适配器模式-适配器包含一个类的实例，调用实例实现接口
     *  - 类适配器模式-适配器继承自己实现的类，一般多重继承来实现
     * 
     * 构成：Target, Adaptor, Adaptee
     */
    public static void main(String[] args) {
        CarAdaptor a = new CarAdaptor();
        Car c = new RunningCar();
        a.adapt(c);
        a.change();
    }
}
