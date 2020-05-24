package Exeptions;

public class AnimalAlreadyInCageExeption extends IllegalArgumentException {
    @Override
    public void printStackTrace() {
        System.out.println("This animal is already in this cage!");
    }
}