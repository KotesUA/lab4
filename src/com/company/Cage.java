package com.company;

import Animals.Animal;

import java.util.ArrayList;
import java.util.UUID;

public class Cage<T extends Animal>{
    private int Capacity;
    private UUID ID;
    private ArrayList<T> animalsInCage;

    public Cage(int capacity){
        this.Capacity = capacity;
        this.ID = UUID.randomUUID();
        this.animalsInCage = new ArrayList<T>();
    }

    public int getAnimalNumber(){
        return animalsInCage.size();
    }

    public boolean isThisAnimalInCage(T animal){return animalsInCage.contains(animal);}


}
