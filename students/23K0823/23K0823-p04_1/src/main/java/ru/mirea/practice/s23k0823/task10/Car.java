package ru.mirea.practice.s23k0823.task10;

class Car extends Transport {
    public Car(String name, double speed, double costPerKm) {
        super(name, speed, costPerKm);
    }

    @Override
    public double calculateTravelTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculateCost(double distance) {
        return distance * costPerKm;
    }
}

