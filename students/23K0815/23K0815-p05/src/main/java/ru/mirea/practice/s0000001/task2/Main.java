package ru.mirea.practice.s0000001.task2;

public abstract class Main {
    public static void main(String[] args) {
        double distance = 1000; // Расстояние в км

        Transport car = new Car(100, 1.0);
        Transport plane = new Plane(900, 5.0);
        Transport train = new Train(80, 0.8);
        Transport ship = new Ship(30, 1.5);

        Transport[] transports = { car, plane, train, ship };

        for (Transport transport : transports) {
            double time = transport.transportTime(distance);
            double cost = transport.transportCost(distance, 0, 0); // К примеру, без пассажиров и груза для простоты

            System.out.println(transport.getClass().getSimpleName() + ":");
            System.out.printf("  Время перевозки: %.2f часов%n", time);
            System.out.printf("  Стоимость перевозки: %.2f единиц%n", cost);
            System.out.println();
        }
    }
}
