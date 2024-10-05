package ru.mirea.practice.s23L0908.practice41.phone;

public abstract class Main {
    public static void main(String[] args) {
        // Создание экземпляров класса Phone
        Phone phone1 = new Phone("88005553535", "iPhone 16 Pro", 200.0);
        Phone phone2 = new Phone("89001234567", "Samsung Galaxy F24");
        Phone phone3 = new Phone(); // Конструктор без параметров

        // Вывод значений переменных
        System.out.println("Телефон 1:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.model);
        System.out.println("Вес: " + phone1.weight);

        System.out.println("\nТелефон 2:");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель: " + phone2.model);
        System.out.println("Вес: " + phone2.weight);

        System.out.println("\nТелефон 3:");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.model);
        System.out.println("Вес: " + phone3.weight);

        // Вызов методов
        System.out.println("\nВызовы:");
        phone1.receiveCall("Иван");
        phone2.receiveCall("Мария", "89111112222");
        phone3.sendMessage("88005553535", "89123456789", "89234567890");
    }
}
