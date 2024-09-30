package ru.mirea.practice.s0000001;

class Ship extends Transport {
    public Ship() {
        super(30, 0.2);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculateCost(double distance, double cargoWeight) {
        return distance * costPerKm * cargoWeight;
    }
}
