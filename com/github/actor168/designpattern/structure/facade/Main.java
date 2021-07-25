package com.github.actor168.designpattern.structure.facade;

/**
 * 外观模式（Facade Pattern）
 * 
 * 定义：隐藏系统复杂性，并向客户端提供一个可以访问的接口；
 * 
 * 如何解决：客户端不与系统耦合，外观类与系统耦合。
 * 
 * 使用场景：
 *  - 为复杂的模块提供外界访问的模块
 *  - 子系统相对独立
 */
public class Main {
    public static void main(String[] args) {
        MineWorkerFacade f = new MineWorkerFacade();
        f.startNewDay();
        f.work();
        f.endTheDay();
    }
}
