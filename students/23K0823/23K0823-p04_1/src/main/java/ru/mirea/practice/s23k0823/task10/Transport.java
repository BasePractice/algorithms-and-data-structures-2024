package ru.mirea.practice.s23k0823.task10;

abstract class Transport {
    protected String name;
    protected double speed;
    protected double costPerKm;

    public Transport(String name, double speed, double costPerKm) {
        this.name = name;
        this.speed = speed;
        this.costPerKm = costPerKm;
    }

    public abstract double calculateTravelTime(double distance);

    public abstract double calculateCost(double distance);

    public String getName() {
        return name;
    }
}
