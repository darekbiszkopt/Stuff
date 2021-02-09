package com.company;

public class Weapon extends Stuff implements IStuff{

    int baseAttack;
    int bonus;

    public Weapon(String name, int weight, int baseAttack, int bonus) {
        super(name, weight);
        this.baseAttack = baseAttack;
        this.bonus = bonus;

    }

    @Override
    public int use() {
        return 1;
    }

}
