package ua.kovalev;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("dry eat", "white", 4, "Barsik");
        Animal dog = new Dog("meet", "black", 7, "Cesar");

        System.out.println(cat.toString());
        System.out.println(dog.toString());

        Veterinarian veterinarian = new Veterinarian("Aibolit");

        veterinarian.treatment(cat);
        veterinarian.treatment(dog);
    }
}
