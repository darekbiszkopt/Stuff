package com.company;

public class Arena {

    private Avatar avatar;
    private Monster monster;

    static  int counter;

    public Arena(Avatar avatar, Monster monster) {
        this.avatar = avatar;
        this.monster = monster;
    }

    public void fight() {

        do{

            avatar.hurt((double)monster.attack());
            monster.hurt((double)avatar.attack());

            System.out.println("A " + avatar.getHealth());
            System.out.println("M " +monster.getHealth());
            counter++;
        }
        while (avatar.getHealth() > 1 & monster.getHealth() > 1);

        if (avatar.getHealth() >  monster.getHealth())
            System.out.println("Bohater " + avatar.getCharacterName()+ " pokonuje potwora" );
        else
            System.out.println("Niestety bohater " + avatar.getCharacterName() + " zostaje pokonany przez potwora");

    }
}


