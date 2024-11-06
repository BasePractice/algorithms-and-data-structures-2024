package ru.mirea.practice.s23k0140.task3;

public abstract class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Россия, Ленинградская область, Санкт-Петербург, набережная реки Мойки, 12, , ");
        Address address2 = new Address(", Московская область, Москва, улица Спиридоновка, 2, 1, ");
        Address address3 = new Address(", , Санкт-Петербург, проспект Ветеранов, 99, , ");
        Address address4 = new Address("Германия, Бавария, Мюнхен, Штутгартская, 45; 3; 9");

        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
        System.out.println(address4);
    }
}