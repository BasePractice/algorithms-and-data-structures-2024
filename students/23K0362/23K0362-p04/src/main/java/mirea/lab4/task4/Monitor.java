package mirea.lab9.task4;

public class Monitor {
    private String name;
    private double inches;

    public Monitor(String name, double inches) {
        this.name = name;
        this.inches = inches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    @Override
    public String toString() {
        return "Monitor{" + "name='" + name + '\'' + ", inches=" + inches + '}';
    }
}
