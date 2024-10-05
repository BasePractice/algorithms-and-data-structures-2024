package ru.mirea.practice.s23k0755.third;

public class Car extends Transport {
    public Car() {
        super("Автомобиль", 80, 0.5);
    }

    @Override
    public double travelTime(double distance) {
        return distance / speed;
    }

    @Override
    public double cost(double distance, int passengers, double cargoWeight) {
        return distance * costPerKm * passengers;
    }
}
