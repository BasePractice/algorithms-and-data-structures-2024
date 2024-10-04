package ru.mirea.practice.s0000001.n2;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("965-456-789", "Samsung", 150);
        Phone phone2 = new Phone("982-654-321", "Irbis", 140);
        Phone phone3 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Алексей");
        phone2.receiveCall("Мария", "982-654-321");

        System.out.println("Номер телефона: " + phone1.getNumber());
        System.out.println("Номер телефона: " + phone2.getNumber());

        phone1.sendMessage("965-456-789", "982-654-321", "977-555-555");
    }
}