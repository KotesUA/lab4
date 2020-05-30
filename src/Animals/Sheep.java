package Animals;

public class Sheep extends Animal {
    public Sheep(String name, int age) {
        super(name, age);
        super.setPredator(false);
    }
}
