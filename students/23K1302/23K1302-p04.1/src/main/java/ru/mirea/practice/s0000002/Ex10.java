package ru.mirea.practice.s0000002;

public final class Ex10 {

    private Ex10() {
        // Пустота
    }

    public static void main(String[] args) {

        Transport car = new Car();
        Transport plane = new Plane();
        Transport train = new Train();
        Transport ship = new Ship();

        double distance = 500;
        double passengers = 3;
        double cargoWeight = 1000;

        System.out.println("Автомобиль:");
        System.out.println("Время: " + car.calculateTime(distance) + " ч");
        System.out.println("Стоимость: " + car.calculateCost(distance, passengers) + " $");

        System.out.println("\nСамолет:");
        System.out.println("Время: " + plane.calculateTime(distance) + " ч");
        System.out.println("Стоимость: " + plane.calculateCost(distance, passengers) + " $");

        System.out.println("\nПоезд:");
        System.out.println("Время: " + train.calculateTime(distance) + " ч");
        System.out.println("Стоимость: " + train.calculateCost(distance, passengers) + " $");

        System.out.println("\nКорабль (перевозка груза):");
        System.out.println("Время: " + ship.calculateTime(distance) + " ч");
        System.out.println("Стоимость: " + ship.calculateCost(distance, cargoWeight) + " $");
    }
}
