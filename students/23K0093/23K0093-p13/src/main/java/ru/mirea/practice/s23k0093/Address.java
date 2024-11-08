package ru.mirea.practice.s23k0093;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // Конструктор
    public Address(String country, String region, String city, String street, String house, String building, String apartment) {
        this.country = country.trim();
        this.region = region.trim();
        this.city = city.trim();
        this.street = street.trim();
        this.house = house.trim();
        this.building = building.trim();
        this.apartment = apartment.trim();
    }

    // Метод для разбора адреса с запятой
    public static Address parseWithComma(String addressLine) {
        String[] parts = addressLine.split(",");
        return new Address(parts[0], parts[1], parts[2], parts[3], parts[4], parts.length > 5 ? parts[5] : "", parts.length > 6 ? parts[6] : "");
    }

    // Метод для разбора адреса с любыми разделителями
    public static Address parseWithVariousDelimiters(String addressLine) {
        StringTokenizer tokenizer = new StringTokenizer(addressLine, ",.;");
        String[] parts = new String[tokenizer.countTokens()];
        int index = 0;
        while (tokenizer.hasMoreTokens()) {
            parts[index++] = tokenizer.nextToken().trim();
        }
        return new Address(parts[0], parts[1], parts[2], parts[3], parts[4], parts.length > 5 ? parts[5] : "", parts.length > 6 ? parts[6] : "");
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
}
