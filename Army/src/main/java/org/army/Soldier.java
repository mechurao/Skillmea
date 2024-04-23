package org.army;

public abstract class Soldier {
    protected String name;
    protected int damage;

    public Soldier(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attack();
    public abstract void defend();
    public abstract void report();
}

