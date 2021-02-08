package com.company;

public class Avatar {



    private String characterName;
    private int health;
    private Stuff hand = null;
    private Weapon weapon1;

    public Avatar(String characterName, int health, Stuff hand) {

        this.characterName = characterName;
        this.health = health;
        this.hand = hand;
    }

    public boolean isAlive (int health){

        if (health > 0)
            return true;
        else
            return false;
    }

    public int attack(){

        if (getHand() == weapon1)
            return weapon1.baseAttack;
        else return 0;

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
                ", weapon1=" + weapon1 +
                '}';
    }
}
