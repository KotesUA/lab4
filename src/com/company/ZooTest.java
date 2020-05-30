package com.company;

import Animals.Animal;
import Animals.Lion;
import Animals.Ostrich;
import Exeptions.CannotFindAnimalExeption;
import Exeptions.NoSpaceExeption;
import Exeptions.WrongAnimalTypeExeption;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    static Zoo zoo = new Zoo();

    @Test
    void zooTest(){
        Cage cage1 = new Cage(2);
        cage1.addAnimal(new Lion("Ben", 10));
        assertThrows(WrongAnimalTypeExeption.class, () -> cage1.addAnimal(new Ostrich("Vasya", 5)));
        assertThrows(NoSpaceExeption.class, () -> {
            cage1.addAnimal(new Lion("Vasya", 5));
            cage1.addAnimal(new Lion("Petya", 5));
        });
        assertThrows(CannotFindAnimalExeption.class, () -> cage1.removeAnimal(new Animal("Name", 1)));
    }
}