package ru.mirea.practice.s23k0362.practice41.phone;

public class Phone {
    public String number;
    public String model;
    public double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами
    public Phone(String number, String model) {
        this(number, model, 0.0); // Вызов конструктора с тремя параметрами
    }

    // Конструктор без параметров
    public Phone() {
        this("", "", 0.0); // Вызов конструктора с тремя параметрами
    }

    // Метод для получения номера телефона
    public String getNumber() {
        return number;
    }

    // Метод для получения звонка
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    // Перегруженный метод для получения звонка с номером звонящего
    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + " с номера " + callerNumber);
    }

    // Метод для отправки сообщения
    public void sendMessage(String... phoneNumbers) {
        System.out.println("Сообщение отправлено на номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}
