package ru.mirea.practice.s23k0755.third;

public class Train extends Transport {
    public Train() {
        super("Поезд", 120, 0.8);
    }

    @Override
    public double travelTime(double distance) {
        return distance / speed;
    }

    @Override
    public double cost(double distance, int passengers, double cargoWeight) {
        return distance * costPerKm * passengers + cargoWeight * 0.05;
    }
}