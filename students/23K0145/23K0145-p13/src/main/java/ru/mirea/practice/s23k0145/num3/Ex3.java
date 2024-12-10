package ru.mirea.practice.s23k0145.num3;

import java.util.StringTokenizer;

public final class Ex3 {

    private Ex3() {

    }

    public static Adress parseAddressWithSplit(String address) {
        String[] parts = address.split(",");
        if (parts.length < 6) {
            throw new IllegalArgumentException("Недостаточно частей адреса.");
        }
        return new Adress(
                parts[0].trim(),
                parts[1].trim(),
                parts[2].trim(),
                parts[3].trim(),
                parts[4].trim(),
                parts.length > 5 ? parts[5].trim() : null,
                parts.length > 6 ? parts[6].trim() : null
        );
    }

    public static Adress parseAddressWithTokenizer(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
        String[] parts = new String[7];
        int i = 0;
        while (tokenizer.hasMoreTokens() && i < parts.length) {
            parts[i++] = tokenizer.nextToken().trim();
        }

        if (i < 6) {
            throw new IllegalArgumentException("Недостаточно частей адреса.");
        }

        return new Adress(
                parts[0],
                parts[1],
                parts[2],
                parts[3],
                parts[4],
                i > 5 ? parts[5] : null,
                i > 6 ? parts[6] : null
        );
    }

    public static void main(String[] args) {

        String address1 = "Россия, Москва, Москва, Арбат, 12, 1, 34";
        String address2 = "США, Калифорния, Лос-Анджелес, Беверли Хиллз, 1234, 5, 67";
        String address3 = "Франция, Иль-де-Франс, Париж, Елисейские поля, 8, 2, 88";
        String address4 = "Германия, Бавария, Мюнхен, Штутгартская, 45; 3; 9";


        System.out.println("Разбор адреса с использованием split():");
        System.out.println(parseAddressWithSplit(address1));
        System.out.println(parseAddressWithSplit(address2));
        System.out.println(parseAddressWithSplit(address3));

        System.out.println("\nРазбор адреса с использованием StringTokenizer:");
        System.out.println(parseAddressWithTokenizer(address4));
    }
}
