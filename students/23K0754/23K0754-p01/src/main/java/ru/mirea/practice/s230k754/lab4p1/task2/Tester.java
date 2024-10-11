package ru.mirea.practice.s230k754.lab4p1.task2;

public final class Tester {
    private Tester() {}

    public static void main(String[] args) {
        Phone phone1 = new Phone("+7...1", "model1", 16.2);
        Phone phone2 = new Phone("+7...2", "model2");
        Phone phone3 = new Phone();


        phone1.receiveCall("Tester1");
        phone2.receiveCall("Tester2");
        phone3.receiveCall("Tester3");

        phone1.receiveCall("Tester1", "model1");
        phone2.receiveCall("Tester2", "model2");
        phone3.receiveCall("Tester3", "model3");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
    }
}
