package ru.mirea.practice.s23K0135;

public abstract class PhoneTester {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("8-888-888-88-88","aaa");
        Phone phone3 = new Phone("8-777-777-77-77","ooo",0.4);
        System.out.println(phone1.getModel() + " " + phone1.getNumber() + " " + phone1.getWeight());
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " " + phone2.getWeight());
        System.out.println(phone3.getModel() + " " + phone3.getNumber() + " " + phone3.getWeight());
        phone1.receiveCall("name1");
        phone2.receiveCall("name2");
        phone3.receiveCall("name3");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone2.receiveCall("name1", phone3.getNumber());
        phone1.sendMessage(phone2.getNumber(), phone3.getNumber());
    }
}
