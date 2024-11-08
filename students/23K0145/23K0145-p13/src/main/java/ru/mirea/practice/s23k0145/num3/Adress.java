package ru.mirea.practice.s23k0145.num3;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Adress(String country, String region, String city, String street, String house, String building, String apartment) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.building = building;
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return String.join(", ", country, region, city, street, house, building, apartment);
    }
}
