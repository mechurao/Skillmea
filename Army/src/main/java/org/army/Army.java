package org.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Soldier> soldiers = new ArrayList<>();

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    public void attack() {
        System.out.println("-------ATTACK--------");
        soldiers.forEach(Soldier::attack);
    }

    public void defend() {
        System.out.println("-------DEFEND--------");
        soldiers.forEach(Soldier::defend);
    }

    public void report() {
        System.out.println("-------REPORT--------");
        soldiers.forEach(Soldier::report);
    }
}

