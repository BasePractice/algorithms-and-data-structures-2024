package ru.mirea.practice.s23k0093;

public abstract class AddressTest {
    public static void main(String[] args) {
        String address1 = "Россия, Москва, Москва, Тверская, 10, 1, 5";
        String address2 = "США, Калифорния, Лос-Анджелес, Сансет Бульвар, 123, 5, 15";
        String address3 = "Германия; Берлин; Центральный район; Алекса; 100; 2; 3";
        String address4 = "Франция. Париж. Эйфелева башня. 1. 5. 8";

        // Разбор адресов с запятыми
        System.out.println("Разбор адресов с запятыми:");
        Address addr1 = Address.parseWithComma(address1);
        Address addr2 = Address.parseWithComma(address2);
        System.out.println(addr1);
        System.out.println(addr2);

        // Разбор адресов с разными разделителями
        System.out.println("Разбор адресов с различными разделителями:");
        Address addr3 = Address.parseWithVariousDelimiters(address3);
        Address addr4 = Address.parseWithVariousDelimiters(address4);
        System.out.println(addr3);
        System.out.println(addr4);
    }
}
