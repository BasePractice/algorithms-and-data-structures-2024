package ru.mirea.practice.s0000001.task10;

class Car extends Transport {
    public Car() {
        super(150, 7); // скорость 100 км/ч, стоимость 5 руб/км
    }

    @Override
    public double calculatePassengerCost(int passengers, double distance) {
        return calculateCost(distance) * passengers; // стоимость для пассажиров
    }

    @Override
    public double calculateCargoCost(double cargoWeight, double distance) {
        return calculateCost(distance); // стоимость для груза
    }
}
