package ru.mirea.practice.s23k0087.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Address adr1 = new Address();
        adr1.setAddress("Россия, Москва, Проспект Вернадского, 78");
        Address adr2 = new Address();
        adr2.setAddress("Россия, Москва, Проспект Вернадского, 86");
        Address adr3 = new Address();
        adr3.setAddress("Российская Федерация, Екатеринбург, ул. Ленина, 22, 2");
        Address adr4 = new Address();
        adr4.setAddress("Соединенные Штаты Америки, Нью-Йорк, Бродвей, 44");

        System.out.println(adr1);
        System.out.println(adr2);
        System.out.println(adr3);
        System.out.println(adr4);

        System.out.println("----------------------------------------------------");

        adr1.setAddress("Россия. Москва. Проспект Вернадского. 78", '.');
        adr2.setAddress("Россия: Москва: Проспект Вернадского: 86", ':');
        adr3.setAddress("Российская Федерация; Екатеринбург; ул. Ленина; 22; 2", ';');
        adr4.setAddress("Соединенные Штаты Америки! Нью-Йорк! Бродвей! 44", '!');

        System.out.println(adr1);
        System.out.println(adr2);
        System.out.println(adr3);
        System.out.println(adr4);
    }
}
