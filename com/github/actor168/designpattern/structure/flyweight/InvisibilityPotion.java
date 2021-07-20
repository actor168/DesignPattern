package com.github.actor168.designpattern.structure.flyweight;

public class InvisibilityPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("invisibilty potions " + System.identityHashCode(this));        
    }
    
}
