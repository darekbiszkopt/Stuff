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
        else if (getHand().use() == 2){

            //getHealth() = getHealth() -  getHand().getHealAmount();
            System.out.println(getHand().getHealAmount());
        return  getHealth();
        }
        else {
            System.out.println("nic");
            //System.out.println(getBaseAttack());
            return 0;
        }
    }

    @Override
    public int getHealAmount() {
        return getHealAmount();
    }





}
