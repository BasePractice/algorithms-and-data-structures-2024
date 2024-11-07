package ru.mirea.practice.s230k754.lab4p1.task2;

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
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.number = "None";
    }

    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }

    public void receiveCall(String name, String model) {
        System.out.printf("Звонит %s, модель %s\n", name, model);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String...numbers) {
        System.out.println("Номера телефонов");
        for (String number: numbers) {
            System.out.println(number);
        }
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }
}
