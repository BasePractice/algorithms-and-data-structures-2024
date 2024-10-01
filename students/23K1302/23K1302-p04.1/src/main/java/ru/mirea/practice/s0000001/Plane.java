package ru.mirea.practice.s0000001;

class Plane extends Transport {
    public Plane() {
        super(900, 0.5);
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
