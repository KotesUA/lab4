package com.company;

import java.util.ArrayList;

public class Zoo {
    private String Name;
    private ArrayList<Cage> Cages;

    public void addCage(Cage cage){
        Cages.add(cage);
        System.out.println("Cage added successfully");
    }

    public int getAnimalsNumber(){
        int sum = 0;
        for (Cage cage:Cages
             ) {
            sum += cage.getAnimalNumber();
        }
        return sum;
    }
}
