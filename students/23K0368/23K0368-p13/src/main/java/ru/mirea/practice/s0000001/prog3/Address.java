package ru.mirea.practice.s0000001.prog3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address() {
        this.country = "";
        this.region = "";
        this.city = "";
        this.street = "";
        this.house = "";
        this.building = "";
        this.apartment = "";
    }

    // Метод для парсинга адреса с разделителем - запятая
    public void parseAddressWithComma(String address) {
        String[] parts = address.split(",");
        if (parts.length != 7) {
            throw new IllegalArgumentException("Неверный формат адреса");
        }

        StringBuilder builder = new StringBuilder();
        builder.append(parts[0].trim()).append(", ");
        builder.append(parts[1].trim()).append(", ");
        builder.append(parts[2].trim()).append(", ");
        builder.append(parts[3].trim()).append(", ");
        builder.append(parts[4].trim()).append(", ");
        builder.append(parts[5].trim()).append(", ");
        builder.append(parts[6].trim());

        this.country = builder.toString();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.building = parts[5].trim();
        this.apartment = parts[6].trim();
    }

    // Метод для парсинга адреса с любыми разделителями: ',' '.' ';' '-'
    public void parseAddressWithMultipleDelimiters(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;-");

        if (tokenizer.countTokens() != 7) {
            throw new IllegalArgumentException("Неверный формат адреса");
        }

        StringBuilder builder = new StringBuilder();
        builder.append(tokenizer.nextToken().trim()).append(", ");
        builder.append(tokenizer.nextToken().trim()).append(", ");
        builder.append(tokenizer.nextToken().trim()).append(", ");
        builder.append(tokenizer.nextToken().trim()).append(", ");
        builder.append(tokenizer.nextToken().trim()).append(", ");
        builder.append(tokenizer.nextToken().trim()).append(", ");
        builder.append(tokenizer.nextToken().trim());

        this.country = builder.toString();
        this.region = tokenizer.nextToken().trim();
        this.city = tokenizer.nextToken().trim();
        this.street = tokenizer.nextToken().trim();
        this.house = tokenizer.nextToken().trim();
        this.building = tokenizer.nextToken().trim();
        this.apartment = tokenizer.nextToken().trim();
    }

    // Метод для отображения адреса
    public String toString() {
        return "Страна: " + country + "\n"
            + "Регион: " + region + "\n"
            + "Город: " + city + "\n"
            + "Улица: " + street + "\n"
            + "Дом: " + house + "\n"
            + "Корпус: " + building + "\n"
            + "Квартира: " + apartment;
    }
}
