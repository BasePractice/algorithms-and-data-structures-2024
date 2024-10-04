package mirea.lab9.task4;

public class Memory {
    private String name;
    private double frequency;

    public Memory(String name, double frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Memory{" + "name='" + name + '\'' + ", frequency=" + frequency + '}';
    }
}
