package com.company;

import Animals.Animal;

import java.util.ArrayList;
import java.util.UUID;

public class Cage{
    private int Capacity;
    private UUID ID;
    private ArrayList<Animal> animalsInCage;

    public Cage(int capacity){
        this.Capacity = capacity;
        this.ID = UUID.randomUUID();
        this.animalsInCage = new ArrayList<Animal>();
    }

    public int getAnimalNumber(){
        return animalsInCage.size();
    }
}
