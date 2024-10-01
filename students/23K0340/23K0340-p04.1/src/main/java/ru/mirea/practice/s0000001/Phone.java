package ru.mirea.practice.s0000001;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.model = model;
        this.number = number;
        this.weight = 0.0;
    }

    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0.0;
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

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ": " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... phoneNumbers) {
        for (String phoneNumber : phoneNumbers) {
            System.out.print(phoneNumber + " ");
        }
        System.out.println();
    }
}