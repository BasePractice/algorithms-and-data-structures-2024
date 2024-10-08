package ru.mirea.practice.s23K0135.task2;

class Ship extends Transport {
    public Ship(double speed, double costPerKm) {
        super(speed, costPerKm);
    }

    @Override
    public double transportTime(double distance) {
        return distance / speed; // Время в часах
    }

    @Override
    public double transportCost(double distance, int passengers, double weight) {
        return distance * costPerKm * 2.0; // Дороже из-за длительности и дополнительных затрат
    }
}
