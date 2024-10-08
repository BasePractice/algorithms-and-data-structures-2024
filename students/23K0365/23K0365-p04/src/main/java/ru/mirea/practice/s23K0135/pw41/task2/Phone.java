package ru.mirea.practice.s23K0135.pw41.task2;

public class Phone {
    private int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this.weight = weight;
        new Phone(number, model);
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        //Default constructor
    }

    public void recieveCall(String callerName) {
        System.out.println("Call from " + callerName);
    }

    public void recieveCall(String callerName, int callerNumber) {
        System.out.println("Call from " + callerName + ". Phone number: " + callerNumber);
    }

    public void sendMessage(int...numbers) {
        for (int x : numbers) {
            System.out.println(x);
        }
    }

    public int getNumber() {
        return number;
    }
}
