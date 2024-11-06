package ru.mirea.practice.s0000001.task2;

class Car extends Transport {
    public Car(double speed, double costPerKm) {
        super(speed, costPerKm);
    }

    @Override
    public double transportTime(double distance) {
        return distance / speed; // Время в часах
    }

    @Override
    public double transportCost(double distance, int passengers, double weight) {
        return distance * costPerKm; // Стоимость перевозки для автомобиля
    }
}

