package ua.kovalev;

public class Dog extends Animal {
    private String name;

    public Dog() {
        super();
    }

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    @Override
    public String getVoice() {
        return "Gav-Gav";
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating now");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping now");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' + ", " + super.toString() +
                '}';
    }
}
