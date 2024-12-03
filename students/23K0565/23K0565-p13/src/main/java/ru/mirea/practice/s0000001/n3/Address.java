package ru.mirea.practice.s0000001.n3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // метод для разбора строки только с ,
    public void parseAdd1(String address) {
        String[] parts = address.split(",");
        if (parts.length >= 7) {
            country = parts[0].trim();
            region = parts[1].trim();
            city = parts[2].trim();
            street = parts[3].trim();
            house = parts[4].trim();
            building = parts[5].trim();
            apartment = parts[6].trim();
        }
    }

    public void parseAdd2(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",;.:");
        if (tokenizer.countTokens() >= 7) {
            country = tokenizer.nextToken().trim();
            region = tokenizer.nextToken().trim();
            city = tokenizer.nextToken().trim();
            street = tokenizer.nextToken().trim();
            house = tokenizer.nextToken().trim();
            building = tokenizer.nextToken().trim();
            apartment = tokenizer.nextToken().trim();
        }
    }

    @Override
    public String toString() {
        return "Address{"
            + "country='" + country + '\''
            + ", region='" + region + '\''
            + ", city='" + city + '\''
            + ", street='" + street + '\''
            + ", house='" + house + '\''
            + ", building='" + building + '\''
            + ", apartment='" + apartment + '\''
            + '}';
    }

    public static void main(String[] args) {
        Address address = new Address();

        address.parseAdd1("Россия, Московская область, Москва, проспект Вернадского, 78, 2, В108");
        System.out.println("Адрес с запятой: " + address);

        address.parseAdd2("Россия;Московская область.Москва:проспект Вернадского,78;2.В108");
        System.out.println("Адрес с несколькими разделителями: " + address);
    }
}
