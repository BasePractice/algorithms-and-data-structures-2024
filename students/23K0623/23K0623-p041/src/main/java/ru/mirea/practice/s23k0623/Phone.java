package ru.mirea.practice.s23k0623;

public class Phone {
    String number;
    String model;
    float weight = 0;

    public Phone() {
        // Default constructor
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, float weight) {
        Phone phone = new Phone(number, model);
        this.number = phone.number;
        this.model = phone.number;
        this.weight = weight;
    }

    public void recieveCall(String caller) {
        System.out.println("Звонит " + caller);
    }

    public void recieveCall(String caller, String number) {
        System.out.println("Звонит " + caller + " по номеру " + number);
    }

    public void sendMessage(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public String getNumber() {
        return number;
    }
}
