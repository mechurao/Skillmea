package org.army;

public class DefensiveSoldier extends Soldier {
    public DefensiveSoldier(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attack() {
        System.out.println(name + " the Archer shoots arrows, dealing " + damage + " damage.");
    }

    @Override
    public void defend() {
        System.out.println(name + " the Archer uses a parapet for defense.");
    }

    @Override
    public void report() {
        System.out.println("Soldier " + name + " here. Type - DEFENSIVE");
    }
}

