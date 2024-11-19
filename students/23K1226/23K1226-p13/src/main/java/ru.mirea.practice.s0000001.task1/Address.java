package ru.mirea.practice.s0000001.task1;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",");
        this.country = tokenizer.nextToken().trim();
        this.region = tokenizer.nextToken().trim();
        this.city = tokenizer.nextToken().trim();
        this.street = tokenizer.nextToken().trim();
        this.house = tokenizer.nextToken().trim();
        if (tokenizer.hasMoreTokens()) {
            this.building = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            this.apartment = tokenizer.nextToken().trim();
        }
    }

    @Override
    public String toString() {
        return "Country: " + country + ", Region: " + region + ", City: " + city + ", Street: " + street
                + ", House: " + house + ", Building: " + (building != null ? building : "N/A")
                + ", Apartment: " + (apartment != null ? apartment : "N/A");
    }
}
