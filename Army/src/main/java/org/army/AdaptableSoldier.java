package org.army;

public class AdaptableSoldier extends Soldier {
    public AdaptableSoldier(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attack() {
        System.out.println(name + " the Swordsman adapts and attacks, dealing " + damage + " damage.");
    }

    @Override
    public void defend() {
        System.out.println(name + " the Swordsman adapts his defense.");
    }

    @Override
    public void report() {
        System.out.println("Soldier " + name + " here. Type - ADAPTABLE");
    }
}

