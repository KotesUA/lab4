package com.company;

import java.util.ArrayList;

public class Zoo {
    private String Name;
    private ArrayList<Cage> Cages;
    private int animalsNumber;

    public String getName(){return Name;}
    public ArrayList<Cage> getCages(){return Cages;}
    public int getAnimalsNumber(){return animalsNumber;}

    public void addCage(Cage cage){
        Cages.add(cage);
        animalsNumber += cage.getAnimalNumber();
        System.out.println("Cage added successfully");
    }
}
