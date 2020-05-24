package Exeptions;

public class WrongAnimalTypeExeption extends IllegalArgumentException {
    @Override
    public void printStackTrace() {
        System.out.println("This animal is wrong type for this cage!");
    }
}