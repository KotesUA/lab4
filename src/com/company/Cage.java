package com.company;

import Animals.Animal;
import Exeptions.AnimalAlreadyInCageExeption;
import Exeptions.CannotFindAnimalExeption;
import Exeptions.NoSpaceExeption;

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

    public void addAnimal(T animal){
        if (!isThisAnimalInCage(animal) && getAnimalNumber() < Capacity){
            animalsInCage.add(animal);
        }
        if (isThisAnimalInCage(animal)) throw new AnimalAlreadyInCageExeption();
        if (getAnimalNumber() == Capacity) throw new NoSpaceExeption();
    }

    public void removeAnimal(T animal){
        if (isThisAnimalInCage(animal)) animalsInCage.remove(animal);
        if (!isThisAnimalInCage(animal)) throw new CannotFindAnimalExeption();
    }
}
