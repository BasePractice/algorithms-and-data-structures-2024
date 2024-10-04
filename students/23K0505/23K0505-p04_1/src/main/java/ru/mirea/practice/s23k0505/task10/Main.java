package ru.mirea.practice.s23k0505.task10;

public abstract class Main {
    public static void main(String[] args) {
        Car car = new Car(110f, 200f, 4, 300);
        Plane plane = new Plane(950f, 5000f, 20, 5000);
        Train train = new Train(250f, 150f, 500, 5000000);
        Ship ship = new Ship(1.852 * 15, 150f, 20, 120000000);

        Vehicle[] vehicles = new Vehicle[]{car, plane, train, ship};

        for (Vehicle vehicle : vehicles) {
            vehicle.transportPassengers(500, 1000);
            System.out.println();
            vehicle.transportCargo(1000 * 1000, 1000);
            System.out.println();
        }
    }
}
