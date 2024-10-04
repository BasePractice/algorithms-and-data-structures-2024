package ru.mirea.practice.s0000001.task10;

class Ship extends Transport {
    public Ship() {
        super(75, 18); // скорость 50 км/ч, стоимость 15 руб/км
    }

    @Override
    public double calculatePassengerCost(int passengers, double distance) {
        return calculateCost(distance) * passengers; // стоимость для пассажиров
    }

    @Override
    public double calculateCargoCost(double cargoWeight, double distance) {
        return calculateCost(distance) * (cargoWeight / 500); // стоимость для груза (по весу)
    }
}
