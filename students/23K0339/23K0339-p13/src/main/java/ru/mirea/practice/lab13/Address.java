package ru.mirea.practice.lab13;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public void parseAddressComma(String address) {
        String[] parts = address.split(",");
        if (parts.length >= 7) {
            country = parts[0].trim();
            region = parts[1].trim();
            city = parts[2].trim();
            street = parts[3].trim();
            house = parts[4].trim();
            building = parts[5].trim();
            apartment = parts[6].trim();
        } else {
            System.out.println("Неверный формат адреса");
        }
    }

    public void parseAddressMultipleDelimiters(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
        if (tokenizer.countTokens() >= 7) {
            country = tokenizer.nextToken().trim();
            region = tokenizer.nextToken().trim();
            city = tokenizer.nextToken().trim();
            street = tokenizer.nextToken().trim();
            house = tokenizer.nextToken().trim();
            building = tokenizer.nextToken().trim();
            apartment = tokenizer.nextToken().trim();
        } else {
            System.out.println("Неверный формат адреса");
        }
    }

    @Override
    public String toString() {
        return "Страна='" + country + '\''
                + ", Регион='" + region + '\''
                + ", Город='" + city + '\''
                + ", Улица='" + street + '\''
                + ", Дом='" + house + '\''
                + ", Корпус='" + building + '\''
                + ", Квартира='" + apartment + '\'';
    }
}

