package ua.kovalev;

public abstract class Animal {
    private String ration;
    private String color;
    private int weight;

    public Animal() {
        super();
    }

    public Animal(String ration, String color, int weight) {
        super();
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public abstract String getVoice();
    public abstract void eat();
    public abstract void sleep();

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ration='" + ration + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
