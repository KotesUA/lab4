package Exeptions;

public class NoSpaceExeption extends IllegalArgumentException {
    @Override
    public void printStackTrace() {
        System.out.println("This cage has no enough space!");
    }
}