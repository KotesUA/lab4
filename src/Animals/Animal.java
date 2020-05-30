package Animals;

public class Animal {
    private String Name;
    private int Age;
    private boolean Predator;

    public Animal(String name, int age){
        this.Name = name;
        this.Age = age;
    }

    protected void setPredator(boolean predator){Predator = predator;}

    @Override
    public String toString() {
        return "Name: " + Name + "; age: " + Age + "; predator: " + Predator;
    }
}
