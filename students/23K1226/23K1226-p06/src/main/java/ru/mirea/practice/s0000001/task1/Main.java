package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Planet earth = new Planet("Earth");
            System.out.println(earth.getName());

            Car car = new Car("Tesla", 49999);
            System.out.println(car.getName() + " costs " + car.getPrice());

            MovablePoint point = new MovablePoint(5, 10);
            point.move(3, 7);

            Book book = new Book("Effective Java");
            Magazine magazine = new Magazine("Java Magazine");

            Printable[] printables = {book, magazine};
            for (Printable printable : printables) {
                printable.print();
            }

            Shop shop = new Shop();
            shop.addComputer(new Computer("Dell", new Processor("Intel i7"), new Memory(16), new Monitor("1920x1080")));

            shop.print();

            CelsiusToFahrenheitConverter cToF = new CelsiusToFahrenheitConverter();
            System.out.println("25 Celsius in Fahrenheit: " + cToF.convert(25));

            CelsiusToKelvinConverter cToK = new CelsiusToKelvinConverter();
            System.out.println("25 Celsius in Kelvin: " + cToK.convert(25));

            CustomStringBuilder customStringBuilder = new CustomStringBuilder();
            customStringBuilder.append("Hello");
            customStringBuilder.append(" World");
            System.out.println(customStringBuilder.toString());
            customStringBuilder.undo();
            System.out.println(customStringBuilder.toString());

            ObservableStringBuilder observableStringBuilder = new ObservableStringBuilder();
            UserInterface userInterface = new UserInterface();
            observableStringBuilder.addObserver(userInterface);
            observableStringBuilder.append("Hello Observable");
            observableStringBuilder.append(" World");
        }
    }
}
