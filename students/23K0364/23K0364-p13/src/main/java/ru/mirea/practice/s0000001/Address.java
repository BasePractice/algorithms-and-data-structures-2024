package ru.mirea.practice.s0000001;

import java.util.StringTokenizer;

public class Address {

    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // Метод для разделителя запятая
    public void parseAddress(String address) {
        String[] parts = address.split(",");
        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.building = parts[5].trim();
        this.apartment = parts[6].trim();
    }

    // Метод для любого разделителя
    public void parseAddressWithTokenizer(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
        this.country = tokenizer.nextToken().trim();
        this.region = tokenizer.nextToken().trim();
        this.city = tokenizer.nextToken().trim();
        this.street = tokenizer.nextToken().trim();
        this.house = tokenizer.nextToken().trim();
        this.building = tokenizer.nextToken().trim();
        this.apartment = tokenizer.nextToken().trim();
    }

    @Override
    public String toString() {
        return country + ", " + region + ", " + city + ", " + street + ", " + house + ", " + building + ", " + apartment;
    }

    public static void main(String[] args) {
        Address address = new Address();
        address.parseAddress("Russia, Moscow, Tverskaya, 10, 12, 2, 101");
        System.out.println(address);

        Address addressWithTokenizer = new Address();
        addressWithTokenizer.parseAddressWithTokenizer("Russia; Moscow; Tverskaya; 10; 12; 2; 101");
        System.out.println(addressWithTokenizer);
    }
}

