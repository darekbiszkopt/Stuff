package com.company;

public class Main {

    public static void main(String[] args) {

        Stuff plecak = new Stuff("Plecak", 50);
        Stuff bluza = new Stuff("Bluza", 5);
        Stuff czapka = new Stuff("Czapka", 2);
        Weapon miecz = new Weapon("Miecz", 100, 67, 6);
        Weapon luk = new Weapon("Łuk", 60, 46, 5);
        Weapon topor = new Weapon("Topór", 130, 78, 4);

        Avatar legolas = new Avatar("Legolas", 100, luk);
        Avatar gandalf = new Avatar("Gandalf", 150, plecak);


        legolas.isAlive();
        legolas.getHand();
        gandalf.getHand();
        gandalf.attack();
       // legolas.attack();




    }


}
