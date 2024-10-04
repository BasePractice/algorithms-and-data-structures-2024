package ru.mirea.practice.s0000001.praktika4_1;

class Phone {
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

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номера " + number);
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

    public void sendMessage(String... numbers) {
        System.out.println("Отправка сообщения на номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
}

class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Model A", 150);
        Phone phone2 = new Phone("987654321", "Model B", 200);
        Phone phone3 = new Phone("555555555", "Model C");

        System.out.println("Телефон 1: " + phone1.getNumber() + ", " + phone1.getModel() + ", " + phone1.getWeight());
        System.out.println("Телефон 2: " + phone2.getNumber() + ", " + phone2.getModel() + ", " + phone2.getWeight());
        System.out.println("Телефон 3: " + phone3.getNumber() + ", " + phone3.getModel() + ", " + phone3.getWeight());

        phone1.receiveCall("Alice");
        phone2.receiveCall("Bob", "987654321");
        phone3.sendMessage("123456789", "987654321", "555555555");
    }
}
