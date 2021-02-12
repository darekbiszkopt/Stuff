package com.company;

public class Avatar implements IStuff{



    private String characterName;
    private int health;
    private Stuff hand = null;

    public Avatar(String characterName, int health, Stuff hand) {

        this.characterName = characterName;
        this.health = health;
        this.hand = hand;
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

    public int attack(){

        if (getHand().use() == 1){

            return hand.getBaseAttack();

        }
        else {
            System.out.println("nic");
            //System.out.println(getBaseAttack());
            return 0;
        }
    }

    public void hurt (double d){

        health -= d;

    }


    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Stuff getHand() {

        return hand;
    }

    public void setHand(Stuff hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Avatar{" +
                "characterName='" + characterName + '\'' +
                ", health=" + health +
                ", hand=" + hand +
                '}';
    }

    @Override
    public int use() {
        return 0;
    }

    @Override
    public int getBaseAttack() {
        return getBaseAttack();
    }

    @Override
    public int getBonus() {
        return getBonus();
    }


}
