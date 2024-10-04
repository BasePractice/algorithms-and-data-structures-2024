package mirea.lab6.p3;

public class Car implements Nameable  {
    private String type;
    private String name;
    private String color;

    public Car(String type, String name, String color) {
        this.type = type;
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" + "type='" + type + '\'' + ", name='" + name + ", color='" + '\'' + color + '\'' + '}';
    }
}
