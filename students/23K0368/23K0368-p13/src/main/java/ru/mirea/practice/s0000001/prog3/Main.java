package ru.mirea.practice.s0000001.prog3;

public abstract class Main {
    public static void main(String[] args) {
        final String address1 = "Россия, Московская область, Москва, Тверская, 10, 1, 12";
        final String address2 = "Россия. Белгородская область. Старый Оскол. Северный. 30. 1. 301";
        final String address3 = "Россия; Воронежская область; Воронеж; Генерала Люзюкова; 12; 3; 37";
        final String address4 = "Россия- Курская область- Курск- Нахимова- 3- 2- 44";

        // Тест a: Парсинг с использованием разделителя - запятая
        Address addr1 = new Address();
        addr1.parseAddressWithComma(address1);
        System.out.println("Адрес 1 (разделитель: запятая):");
        System.out.println(addr1);
        System.out.println();

        // Тест b: Парсинг с использованием множества разделителей
        Address addr2 = new Address();
        addr2.parseAddressWithMultipleDelimiters(address2);
        System.out.println("Адрес 2 (разделители: , . ; -):");
        System.out.println(addr2);
        System.out.println();

        Address addr3 = new Address();
        addr3.parseAddressWithMultipleDelimiters(address3);
        System.out.println("Адрес 3 (разделители: , . ; -):");
        System.out.println(addr3);
        System.out.println();

        Address addr4 = new Address();
        addr4.parseAddressWithMultipleDelimiters(address4);
        System.out.println("Адрес 4 (разделители: , . ; -):");
        System.out.println(addr4);
    }
}
