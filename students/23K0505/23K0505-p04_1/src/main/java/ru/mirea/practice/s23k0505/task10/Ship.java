package ru.mirea.practice.s23k0505.task10;

public class Ship extends Vehicle {

    public Ship() {
        // Default constructor
    }

    public Ship(double speed, double cost, int passengerSeats) {
        super(speed, cost, passengerSeats);
    }

    public Ship(double speed, double cost, double cargoCapacity) {
        super(speed, cost, cargoCapacity);
    }

    public Ship(double speed, double cost, int passengerSeats, double cargoCapacity) {
        super(speed, cost, passengerSeats, cargoCapacity);
    }

    @Override
    public void transportPassengers(int numOfPassengers, double distance) {
        super.transportPassengers(numOfPassengers, distance);
        System.out.print(" via plane");
    }

    @Override
    public void transportCargo(double weight, double distance) {
        super.transportCargo(weight, distance);
        System.out.print(" via plane");
    }
}
