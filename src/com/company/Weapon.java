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


    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public int getHealAmount() {
        return 0;
    }


    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


    @Override
    public String toString() {
        return "Weapon{name= "  + super.getName() + " weight= "+super.getWeight() +
                " baseAttack=" + baseAttack +
                ", bonus=" + bonus +
                '}';
    }
}
