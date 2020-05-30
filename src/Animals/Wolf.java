package Animals;

public class Wolf extends Animal{
    public Wolf(String name, int age) {
        super(name, age);
        super.setPredator(true);
    }
}
