package com.github.actor168.designpattern.structure.flyweight;

public class HealingPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("healing potions " + System.identityHashCode(this));        
    }
    
}
