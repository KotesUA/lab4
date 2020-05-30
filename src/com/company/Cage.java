package com.company;

import Animals.Animal;
import Exeptions.AnimalAlreadyInCageExeption;
import Exeptions.CannotFindAnimalExeption;
import Exeptions.NoSpaceExeption;
import Exeptions.WrongAnimalTypeExeption;

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
        if (isThisAnimalInCage(animal)) throw new AnimalAlreadyInCageExeption();
        if (getAnimalNumber() == Capacity) throw new NoSpaceExeption();
        if (!isThisAnimalInCage(animal) && getAnimalNumber() < Capacity && getAnimalNumber() == 0){
            animalsInCage.add(animal);
            System.out.println("Animal added: " + animal);
        }
        else if (!isThisAnimalInCage(animal) && getAnimalNumber() < Capacity && getAnimalNumber() != 0){
            if (animal.getClass().equals(this.animalsInCage.get(0).getClass())){
                animalsInCage.add(animal);
                System.out.println("Animal added: " + animal);
            }
            else throw new WrongAnimalTypeExeption();
        }
    }

    public void removeAnimal(T animal){
        if (isThisAnimalInCage(animal)) animalsInCage.remove(animal);
        if (!isThisAnimalInCage(animal)) throw new CannotFindAnimalExeption();
    }
}
