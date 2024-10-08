package ru.mirea.practice.s23K0135;

class Train extends Transport {
    public Train() {
        super(100, 0.05);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculateCost(double distance, double passengers) {
        return distance * costPerKm * passengers;
    }
}
