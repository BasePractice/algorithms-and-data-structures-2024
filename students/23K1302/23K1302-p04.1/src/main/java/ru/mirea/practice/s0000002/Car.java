package ru.mirea.practice.s0000002;

class Car extends Transport {
    public Car() {
        super(80, 0.1);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculateCost(double distance, double passengers) {
        return distance * costPerKm * passengers;
    }
}
