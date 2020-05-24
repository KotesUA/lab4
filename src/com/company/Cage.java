package com.company;

import Animals.Animal;

import java.util.ArrayList;
import java.util.UUID;

abstract public class Cage <T extends Animal>{
    private int Capacity;
    private UUID id;

    public ArrayList<T> animalsInCage;

    {
        id = UUID.randomUUID();
        Capacity = 5;
        animalsInCage = new ArrayList<T>()
    }
}
