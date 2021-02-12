package com.company;

public class Main {

    public static void main(String[] args) {

        Stuff plecak = new Stuff("Plecak", 50);
        Stuff bluza = new Stuff("Bluza", 5);
        Stuff czapka = new Stuff("Czapka", 2);
        Weapon miecz = new Weapon("Miecz", 100, 67, 6);
        Weapon luk = new Weapon("Łuk", 60, 46, 5);
        Weapon topor = new Weapon("Topór", 130, 78, 4);
        Poison poison = new Poison("Medic", 4, 30);


        Warrior legolas = new Warrior("Legolas", 1000, poison);
        Avatar gandalf = new Avatar("Gandalf", 150, poison);
        Monster ork = new Monster(1000, 80, 50);


        legolas.attack();
        gandalf.attack();


        System.out.println(gandalf);
        System.out.println(legolas);

        //ork.getHealth();
        //legolas.isAlive();
        // legolas.getHand();
        //gandalf.getHand();
        //gandalf.attack();
        //System.out.println();
        // Arena arena = new Arena(legolas, ork);
        // arena.fight();

    }
}
