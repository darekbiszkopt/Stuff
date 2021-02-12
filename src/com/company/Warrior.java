package com.company;

public class Warrior extends  Avatar{

    public Warrior(String characterName, int health, Stuff hand)
    {
        super(characterName, health, hand);
    }

    public int attack(){

        if (getHand().use() == 1){

            return getHand().getBaseAttack() + getHand().getBonus();

        }
        else {
            System.out.println("nic");
            //System.out.println(getBaseAttack());
            return 0;
        }
    }

}
