package Exeptions;

public class AnimalAlreadyInCage extends IllegalArgumentException {
    @Override
    public void printStackTrace() {
        System.out.println("This animal is already in this cage!");
    }
}