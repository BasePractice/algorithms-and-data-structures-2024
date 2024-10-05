package ru.mirea.practice.s23L0908;

abstract class Transport {

    protected double speed;

    protected double costPerKm;

    public Transport(double speed, double costPerKm) {
        this.speed = speed;
        this.costPerKm = costPerKm;
    }

    public abstract double calculateTime(double distance);

    public abstract double calculateCost(double distance, double weightOrPassengers);
}
