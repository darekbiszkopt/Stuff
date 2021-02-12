package com.company;

public class Poison extends Stuff implements IStuff {

    int healAmount;

    public Poison(String name, int weight, int healAmount) {
        super(name, weight);
        this.healAmount = healAmount;
    }

    public int getHealAmount() {
        return healAmount;
    }


    @Override
    public int use() {
        return 2;
    }


    @Override
    public String toString() {
        return "Poison{ "  +
                getName()  + " waga " + getWeight() +
                " healAmount= " + healAmount +
                '}';
    }
}
