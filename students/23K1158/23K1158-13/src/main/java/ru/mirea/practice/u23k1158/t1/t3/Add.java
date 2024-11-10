package ru.mirea.practice.u23k1158.t1.t3;

public class Add {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Add(String country, String region, String city, String street, String house, String building, String apartment) {
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