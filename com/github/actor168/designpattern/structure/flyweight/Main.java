package com.github.actor168.designpattern.structure.flyweight;

/**
 * 享元模式：一种为了减少内存使用，使得相类似的对象共享数据而提出的设计模式。
 */
public class Main {
    public static void main(String[] args) {
        PotionFactory factory = new PotionFactory();
        factory.createPotion(PotionType.HEALING).drink();
        factory.createPotion(PotionType.INVISIBILITY).drink();
        factory.createPotion(PotionType.HEALING).drink();
        factory.createPotion(PotionType.INVISIBILITY).drink();
        
    }
}