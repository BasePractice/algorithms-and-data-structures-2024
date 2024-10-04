package ru.mirea.practice.s23k0505.task2;

public abstract class Main {
    public static void main(String[] args) {
        final Phone phone1 = new Phone("1234", "Xiaomi", 250f);
        final Phone phone2 = new Phone("+7911", "iPhone", 125.3f);
        final Phone phone3 = new Phone("+9528", "Samsung", 212f);

        phone1.recieveCall("Саня");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone3.recieveCall("Даня", "777");

        phone2.sendMessage("333", "1917", "2024", "88005553535");
    }
}
