package mirea.lab6.p3;

public class Planet implements Nameable {
    private String name;
    private int radius;
    private int temp;

    public Planet(String name, int radius, int temp) {
        this.name = name;
        this.radius = radius;
        this.temp = temp;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet{" + "name='" + name + '\'' + ", radius=" + ", temp=" + radius + temp + '}';
    }
}
