package ru.mirea.practice.s0000001.task10;

abstract class Transport {
    protected double speed; // скорость в км/ч
    protected double costPerKm; // стоимость за км в рублях

    public Transport(double speed, double costPerKm) {
        this.speed = speed;
        this.costPerKm = costPerKm;
    }

    public double calculateTime(double distance) {
        return distance / speed; // время в часах
    }

    public double calculateCost(double distance) {
        return distance * costPerKm; // стоимость в рублях
    }

    public abstract double calculatePassengerCost(int passengers, double distance);

    public abstract double calculateCargoCost(double cargoWeight, double distance);
}
