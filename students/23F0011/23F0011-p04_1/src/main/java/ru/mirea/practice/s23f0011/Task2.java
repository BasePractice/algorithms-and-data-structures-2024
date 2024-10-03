package ru.mirea.practice.s23f0011;

public class Task2 {
    private final String number;
    private final String model;
    private final double weight;

    public Task2(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами
    public Task2(String number, String model) {
        this(number, model, 0.0);
    }

    public Task2() {
        this("", "");
    }

    public static void main(String[] args) {
        Task2 phone1 = new Task2("123-456-7890", "iPhone 13", 200.0);
        Task2 phone2 = new Task2("987-654-3210", "Samsung Galaxy S22");
        phone1.printInfo();
        System.out.println();
        phone2.printInfo();
        System.out.println();
        Task2 phone3 = new Task2();
        phone3.printInfo();
        System.out.println();

        phone1.receiveCall("Роман");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println();
        phone2.receiveCall("Аня", "111-222-3333");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println();

        phone3.sendMessage("123-456-7890", "987-654-3210", "111-222-3333");
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит " + name + " с номера " + phoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправка сообщения на номера:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public void printInfo() {
        System.out.println("Номер: " + number);
        System.out.println("Модель: " + model);
        System.out.println("Вес: " + weight);
    }
}