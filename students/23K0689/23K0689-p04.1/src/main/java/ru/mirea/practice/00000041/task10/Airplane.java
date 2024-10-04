package ru.mirea.practice.s0000001.task10;

class Airplane extends Transport {
    public Airplane() {
        super(950, 25);
    }

    @Override
    public double calculatePassengerCost(int passengers, double distance) {
        return calculateCost(distance) * passengers; // стоимость для пассажиров
    }

    @Override
    public double calculateCargoCost(double cargoWeight, double distance) {
        return calculateCost(distance) * (cargoWeight / 100); // стоимость для груза (по весу)
    }
}
