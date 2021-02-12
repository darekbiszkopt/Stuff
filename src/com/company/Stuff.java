package com.company;

public class Stuff implements IStuff {

    private String name;
    private int weight;

    public Stuff(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Stuff{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }


    @Override
    public int use() {
        return 0;
    }

    @Override
    public int getBaseAttack() {
        return 0;
    }

    @Override
    public int getBonus() {
        return 0;
    }

    @Override
    public int getHealAmount() {
        return 0;
    }


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
