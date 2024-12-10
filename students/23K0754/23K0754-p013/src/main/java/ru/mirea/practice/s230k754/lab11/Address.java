package ru.mirea.practice.s230k754.lab11;

import java.util.StringTokenizer;

public class Address {
    private String country; // Страна
    private String region;  // Регион
    private String city;    // Город
    private String street;  // Улица
    private String house;   // Дом
    private String building; // Корпус
    private String apartment; // Квартира

    public void parseAddressWithComma(String address) {
        String[] parts = address.split(",");
        if (parts.length >= 6) {
            this.country = parts[0].trim();
            this.region = parts[1].trim();
            this.city = parts[2].trim();
            this.street = parts[3].trim();
            this.house = parts[4].trim();
            this.building = parts[5].trim();
            this.apartment = parts.length > 6 ? parts[6].trim() : "";
        } else {
            throw new IllegalArgumentException("Недостаточно частей адреса.");
        }
    }

    public void parseAddressWithTokenizer(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
        if (tokenizer.countTokens() >= 6) {
            this.country = tokenizer.nextToken().trim();
            this.region = tokenizer.nextToken().trim();
            this.city = tokenizer.nextToken().trim();
            this.street = tokenizer.nextToken().trim();
            this.house = tokenizer.nextToken().trim();
            this.building = tokenizer.nextToken().trim();
            this.apartment = tokenizer.hasMoreTokens() ? tokenizer.nextToken().trim() : "";
        } else {
            throw new IllegalArgumentException("Недостаточно частей адреса.");
        }
    }

    // Метод для отображения адреса
    @Override
    public String toString() {
        return String.join(", ", country, region, city, street, house, building, apartment);
    }
}
