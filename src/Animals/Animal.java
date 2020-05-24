package Animals;

public class Animal {
    private String Name;
    private int Age;
    private String Type;
    private boolean Predator;

    public String getName(){return Name;}
    public int getAge(){return Age;}
    public String getType(){return Type;}
    public boolean getPredator(){return Predator;}

    public Animal(String name, int age){
        this.Name = name;
        this.Age = age;
    }
}
