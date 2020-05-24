package Exeptions;

public class CannotFindAnimalExeption extends IllegalArgumentException {
    @Override
    public void printStackTrace() {
        System.out.println("This animal is not in this cage!");
    }
}