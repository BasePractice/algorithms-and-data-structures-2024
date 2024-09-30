package ru.mirea.practice.s23k0823.task10;

public abstract class Main {
    public static void main(String[] args) {
        Car car = new Car("Машина", 100, 10);
        Plane plane = new Plane("Самолёт", 800, 50);
        Train train = new Train("Поезд", 150, 20);
        Ship ship = new Ship("Корабль", 50, 15);

        double distance = 1000;

        System.out.println("Машина:");
        System.out.println("Время в пути: " + car.calculateTravelTime(distance) + " (ч)");
        System.out.println("Цена: " + car.calculateCost(distance) + " евродолларов");

        System.out.println("\nСамолёт:");
        System.out.println("Время в пути: " + plane.calculateTravelTime(distance) + " (ч)");
        System.out.println("Цена: " + plane.calculateCost(distance) + " евродолларов");

        System.out.println("\nПоезд:");
        System.out.println("Время в пути: " + train.calculateTravelTime(distance) + " (ч)");
        System.out.println("Цена: " + train.calculateCost(distance) + " евродолларов");

        System.out.println("\nКорабль:");
        System.out.println("Время в пути: " + ship.calculateTravelTime(distance) + " (ч)");
        System.out.println("Цена: " + ship.calculateCost(distance) + " евродолларов");
    }
}
