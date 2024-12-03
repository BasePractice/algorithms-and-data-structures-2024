package ru.mirea.practice.s23k0755.third;

public abstract class Transport {
    protected String name;
    protected double speed;
    protected double costPerKm;

    public Transport(String name, double speed, double costPerKm) {
        this.name = name;
        this.speed = speed;
        this.costPerKm = costPerKm;
    }

    public abstract double travelTime(double distance);

    public abstract double cost(double distance, int passengers, double cargoWeight);

    @Override
    public String toString() {
        return "Транспортное средство: " + name + "\nСкорость: " + speed + " км/ч\nСтоимость за км: " + costPerKm;
    }
}
