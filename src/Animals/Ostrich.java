package Animals;

public class Ostrich extends Animal {
    public Ostrich(String name, int age) {
        super(name, age);
        super.setPredator(false);
    }
}
