package ru.mirea.practice.s23k0755.third;

//import ru.mirea.practice.s23k0155.prac41.third.Transport;

public class Plane extends Transport {
    public Plane() {
        super("Самолет", 900, 2.0);
    }

    @Override
    public double travelTime(double distance) {
        return distance / speed;
    }

    @Override
    public double cost(double distance, int passengers, double cargoWeight) {
        return distance * costPerKm * passengers + cargoWeight * 0.1;
    }
}
