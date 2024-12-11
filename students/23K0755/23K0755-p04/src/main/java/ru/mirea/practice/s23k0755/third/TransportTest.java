package ru.mirea.practice.s23k0755.third;

public abstract class TransportTest {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport plane = new Plane();
        Transport train = new Train();
        Transport ship = new Ship();

        double distance = 1000;
        int passengers = 10;
        double cargoWeight = 500;

        Transport[] transports = {car, plane, train, ship};

        for (Transport transport : transports) {
            double time = transport.travelTime(distance);
            double cost = transport.cost(distance, passengers, cargoWeight);
            System.out.println(transport);
            System.out.printf("Время в пути: %.1f часов\n", time);
            System.out.println("Стоимость перевозки: " + cost + " рублей.");
            System.out.println();
        }
    }
}
