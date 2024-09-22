package ru.mirea.practice.s23k0164.t2;

public final class PhoneTest {

    private PhoneTest(){

    }
    public static void main(String[] args) {
        Phone phone1 = new Phone("+79169445678", "iPhone 13", 174);
        Phone phone2 = new Phone("+79112349567", "Samsung Galaxy S21", 169);
        Phone phone3 = new Phone("+79179657804", "Google Pixel 6",  207);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.receiveCall("Саманта", phone1.getNumber());
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone1.sendMessage("+79169445678","+79112349567",  "+79179657804");
        phone2.sendMessage("+79167844567","+79178923495");
    }
}

