package ua.kovalev;

public class Veterinarian {
    private String name;

    public Veterinarian() {
        super();
    }

    public Veterinarian(String name) {
        super();
        this.name = name;
    }

    public void treatment(Animal animal){
        System.out.println("Лечу животное!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                '}';
    }
}
