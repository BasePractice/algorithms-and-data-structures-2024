package ru.mirea.practice.s23K0135;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        this("Unknown", "Unknown");
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.printf("Звонит %s с номера %s\n", name, callerNumber);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщение отправлено сюда: ");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    public void printInfo() {
        System.out.printf("Модель: %s, номер: %s, вес: %f", model, number, weight);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("+78005553535", "Nokia", 196);
        Phone phone2 = new Phone("445796", "Fly");
        Phone phone3 = new Phone();

        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        phone1.receiveCall("Мария");
        System.out.printf("Номер телефона: %s", phone1.getNumber());

        phone2.receiveCall("Дима", "+79001234567");

        phone3.sendMessage("11111111", "22222222", "555555555");
    }


}
