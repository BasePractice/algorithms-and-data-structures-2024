package ru.mirea.practice.s23k0823.task2;

public abstract class PhoneTester {
    public static void main(String[] args) {
        Phone phone1 = new Phone("88005553535", "iPhone", 150.0);
        Phone phone2 = new Phone("88009995566", "Samsung");
        Phone phone3 = new Phone();

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        phone1.receiveCall("John");
        phone2.receiveCall("Jane", "89247007070");
        phone3.receiveCall("Unknown");

        phone1.sendMessage("1234567890", "0987654321", "5551234567");
    }
}
