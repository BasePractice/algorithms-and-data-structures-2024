package ru.mirea.practice.s23k0755.third;

public class Ship extends Transport {
    public Ship() {
        super("Корабль", 30, 1.5);
    }

    @Override
    public double travelTime(double distance) {
        return distance / speed;
    }

    @Override
    public double cost(double distance, int passengers, double cargoWeight) {
        return distance * costPerKm * passengers + cargoWeight * 0.1;
    }
}

