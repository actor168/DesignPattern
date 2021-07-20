package com.github.actor168.designpattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PotionFactory {
    private Map<PotionType, Potion> map;
    public PotionFactory() {
        map = new HashMap<>();
    }

    Potion createPotion(PotionType type) {
        var potion = map.get(type);
        if (potion == null) {
            switch(type) {
                case HEALING:
                    potion = new HealingPotion();
                    map.put(type, potion);
                    break;
                case INVISIBILITY:
                    potion = new InvisibilityPotion();
                    map.put(type, potion);
                    break;
                default:
                    break;
            }
        }
        return potion;
    }
}
