package org.army;

public class OffensiveSoldier extends Soldier {
    public OffensiveSoldier(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attack() {
        System.out.println(name + " the Knight deals " + damage + " damage.");
    }

    @Override
    public void defend() {
        System.out.println(name + " the Knight defends with shields.");
    }

    @Override
    public void report() {
        System.out.println("Soldier " + name + " here. Type - OFFENSIVE");
    }
}

