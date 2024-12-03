package ru.mirea.practice.s0000001.task10;

public final class TransportTest {
    private TransportTest() {

    }

    public static void main(String[] args) {
        Transport car = new Car();
        Transport airplane = new Airplane();
        Transport train = new Train();
        Transport ship = new Ship();

        double distance = 3300; // расстояние 1000 км
        int passengers = 7; // 3 пассажира
        double cargoWeight = 320; // 200 кг груза

        // Подсчет времени и стоимости для каждого вида транспорта
        System.out.println("Автомобиль:");
        System.out.println("Время перевозки: " + car.calculateTime(distance) + " часов");
        System.out.println("Стоимость перевозки пассажиров: " + car.calculatePassengerCost(passengers, distance) + " рублей");
        System.out.println("Стоимость перевозки груза: " + car.calculateCargoCost(cargoWeight, distance) + " рублей");

        System.out.println("\nСамолет:");
        System.out.println("Время перевозки: " + airplane.calculateTime(distance) + " часов");
        System.out.println("Стоимость перевозки пассажиров: " + airplane.calculatePassengerCost(passengers, distance) + " рублей");
        System.out.println("Стоимость перевозки груза: " + airplane.calculateCargoCost(cargoWeight, distance) + " рублей");

        System.out.println("\nПоезд:");
        System.out.println("Время перевозки: " + train.calculateTime(distance) + " часов");
        System.out.println("Стоимость перевозки пассажиров: " + train.calculatePassengerCost(passengers, distance) + " рублей");
        System.out.println("Стоимость перевозки груза: " + train.calculateCargoCost(cargoWeight, distance) + " рублей");

        System.out.println("\nКорабль:");
        System.out.println("Время перевозки: " + ship.calculateTime(distance) + " часов");
        System.out.println("Стоимость перевозки пассажиров: " + ship.calculatePassengerCost(passengers, distance) + " рублей");
        System.out.println("Стоимость перевозки груза: " + ship.calculateCargoCost(cargoWeight, distance) + " рублей");
    }
}
