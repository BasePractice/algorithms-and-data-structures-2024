package ru.mirea.practice.s23k0823.task2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }


    public Phone() {
        this("Unknown", "Unknown", 0.0);
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + " с номера " + callerNumber);
    }

    public void sendMessage(String... numbers) {
        System.out.print("Сообщение будет отправлено на номера: ");
        for (String num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Телефон: номер=" + number + ", модель=" + model + ", вес=" + weight + " г";
    }
}