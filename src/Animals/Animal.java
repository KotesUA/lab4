package Animals;

public class Animal {
    private String Name;
    private int Age;
    private String Type;
    private boolean Predator;

    public Animal(String name, int age){
        this.Name = name;
        this.Age = age;
    }

    @Override
    public String toString() {
        return "Name: " + Name + "; age: " + Age + "; predator: " + Predator;
    }
}
