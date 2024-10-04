package ru.mirea.practice.s0000001.task10;

class Train extends Transport {
    public Train() {
        super(160, 12); // скорость 150 км/ч, стоимость 10 руб/км
    }

    @Override
    public double calculatePassengerCost(int passengers, double distance) {
        return calculateCost(distance) * passengers; // стоимость для пассажиров
    }

    @Override
    public double calculateCargoCost(double cargoWeight, double distance) {
        return calculateCost(distance) * (cargoWeight / 200); // стоимость для груза (по весу)
    }
}
