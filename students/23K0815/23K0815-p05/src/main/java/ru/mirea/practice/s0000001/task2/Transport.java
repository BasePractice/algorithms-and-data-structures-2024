package ru.mirea.practice.s0000001.task2;

abstract class Transport {
    protected double speed; // Скорость в км/ч
    protected double costPerKm; // Стоимость за км

    public Transport(double speed, double costPerKm) {
        this.speed = speed;
        this.costPerKm = costPerKm;
    }

    public abstract double transportTime(double distance); // Метод для расчета времени перевозки

    public abstract double transportCost(double distance, int passengers, double weight); // Метод для расчета стоимости перевозки
}



