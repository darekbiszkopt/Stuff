package com.company;

public class Monster {

    int health;
    int attackPower;
    int attackChance;

    public Monster(int health, int attackPower, int attackChance) {
        this.health = health;
        this.attackPower = attackPower;
        this.attackChance = attackChance;
    }

    public int attack() {

        if (attackChance > (Math.random() * 100))
            return attackPower;

        else return 0;
    }

    public boolean isAlive (){

        if (health > 0) {
            System.out.println("Żywy");
            return true;
        }
        else {
            System.out.println("Dead");
            return false;
        }
    }

}
