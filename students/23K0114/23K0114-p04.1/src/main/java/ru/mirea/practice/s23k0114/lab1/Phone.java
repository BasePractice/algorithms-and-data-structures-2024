package ru.mirea.practice.s23k0114.lab1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами
    public Phone(String number, String model) {
        this(number, model, 0);
    }

    // Конструктор без параметров
    public Phone() {
        this("Неизвестный", "Неизвестный", 0);
    }

    // Метод для получения номера телефона
    public String getNumber() {
        return number;
    }

    // Метод для приёма звонка
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    // Перегруженный метод для приёма звонка с номером телефона
    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит " + name + " с номера " + phoneNumber);
    }

    // Метод для отправки сообщения на несколько номеров
    public void sendMessage(String... numbers) {
        System.out.println("Отправляем сообщение на номера: ");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    @Override
    public String toString() {
        return "Phone[number=" + number + ", model=" + model + ", weight=" + weight + "]";
    }

    public static void main(String[] args) {
        // Создание объектов класса Phone
        Phone phone1 = new Phone("123456789", "ModelX", 150);
        Phone phone2 = new Phone("987654321", "ModelY");
        Phone phone3 = new Phone();

        // Вывод информации о телефонах
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        // Вызов методов
        phone1.receiveCall("Иван");
        System.out.println("Номер телефона: " + phone1.getNumber());

        phone2.receiveCall("Алексей", "987654321");

        // Отправка сообщения на несколько номеров
        phone3.sendMessage("123456789", "987654321", "555555555");
    }
}
