package ru.mirea.practice.s23k0120.task10;

public class Vehicle {
    protected double speed; // Km/h
    protected int passengerSeats; //Num of seats
    protected double cost; // $/(1000 km * 100 kg)
    protected double cargoCapacity; // kg

    public Vehicle() {
        // Default constructor
    }

    public Vehicle(double speed, double cost, int passengerSeats) {
        this.speed = speed;
        this.cost = cost;
        this.passengerSeats = passengerSeats;
    }

    public Vehicle(double speed, double cost, double cargoCapacity) {
        this.speed = speed;
        this.cost = cost;
        this.cargoCapacity = cargoCapacity;
    }

    public Vehicle(double speed, double cost, int passengerSeats, double cargoCapacity) {
        this.speed = speed;
        this.cost = cost;
        this.passengerSeats = passengerSeats;
        this.cargoCapacity = cargoCapacity;
    }

    public double getspeed() {
        return speed;
    }

    public double getCost() {
        return cost;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public int getPassengerSeats() {
        return passengerSeats;
    }

    public void transportPassengers(int numOfPassengers, double distance) {
        double cost = distance * (numOfPassengers * 80) * this.cost / (1000 * 100);
        double time = distance / this.speed;
        System.out.printf("It would cost $ %.2f to transfer %d passengers for %.3f km for %.3f hours", cost, numOfPassengers, distance, time);
    }

    public void transportCargo(double weight, double distance) {
        double cost = distance * weight * this.cost / (1000 * 100);
        double time = distance / this.speed;
        System.out.printf("It would cost $ %f to transfer %f cargo for %f km for %f hours", cost, weight, distance, time);
    }
}
