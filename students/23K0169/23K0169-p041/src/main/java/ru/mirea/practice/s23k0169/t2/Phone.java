package ru.mirea.practice.s23k0169.t2;

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
        this("Unknown", "Unknown", 10.0);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + ". Номер: " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщение отправлено на номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("1234567890", "A", 150.0);
        Phone phone2 = new Phone("0987654321", "B");
        Phone phone3 = new Phone();

        System.out.println("Phone 1: Number: " + phone1.getNumber() + ", Model: " + phone1.model + ", Weight: " + phone1.weight);
        System.out.println("Phone 2: Number: " + phone2.getNumber() + ", Model: " + phone2.model + ", Weight: " + phone2.weight);
        System.out.println("Phone 3: Number: " + phone3.getNumber() + ", Model: " + phone3.model + ", Weight: " + phone3.weight);

        phone1.receiveCall("Alice");
        phone2.receiveCall("Bob", phone2.getNumber());

        phone1.sendMessage("1111111111", "2222222222", "3333333333");
    }
}
