package com.github.actor168.designpattern.structure.bridge;

/**
 * 桥接模式：将一个抽象与实现解耦，以便两者可以独立的变化
 * 
 * 构成：Abstractor, RefinedAbstractor, 
 */
public class Main {
    public static void main(String[] args) {
        Road road = new PavedRoad(new Car());
        road.driveOnRoad();
    }
}
