package ru.mirea.practice.s23k0623;

public abstract class Main {
    public static void main(String[] args) {
        final Phone phone1 = new Phone("1234", "Xiaomi", 250f);
        final Phone phone2 = new Phone("+7911", "iPhone", 125.3f);
        final Phone phone3 = new Phone("+9528", "Samsung", 212f);

        phone1.recieveCall("Андрей");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone3.recieveCall("Саня", "777");

        phone2.sendMessage("222", "191", "2024", "89032779970");
    }
}
