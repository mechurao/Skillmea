package org.army;

public class Main {
    public static void main(String[] args) {
        Army army = new Army();
        army.addSoldier(new OffensiveSoldier("Knight 1", 5));
        army.addSoldier(new DefensiveSoldier("Archer 1", 2));
        army.addSoldier(new AdaptableSoldier("Swordsman 1", 3));

        army.report();
        army.attack();
        army.defend();
    }
}