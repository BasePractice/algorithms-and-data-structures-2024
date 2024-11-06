package mirea.lab9.task4;

public class Processor {
    private String name;
    private double frequency;
    private int countCores;

    public Processor(String name, double frequency, int countCores) {
        this.name = name;
        this.frequency = frequency;
        this.countCores = countCores;
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

    public int getCountCores() {
        return countCores;
    }

    public void setCountCores(int countCores) {
        this.countCores = countCores;
    }

    @Override
    public String toString() {
        return "Processor{" + "name='" + name + '\'' + ", frequency=" + frequency
                + ", countCores=" + countCores + '}';
    }
}
