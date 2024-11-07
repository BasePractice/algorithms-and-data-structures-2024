package ru.mirea.practice.s0000001.task2;

class Train extends Transport {
    public Train(double speed, double costPerKm) {
        super(speed, costPerKm);
    }

    @Override
    public double transportTime(double distance) {
        return distance / speed; // Время в часах
    }

    @Override
    public double transportCost(double distance, int passengers, double weight) {
        return distance * costPerKm * 1.1; // Чуть дешевле, чем самолет
    }
}
