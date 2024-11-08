package ru.mirea.practice.s23k0505.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corps;
    private String apartment;

    public Address(String address) {
        List<String> data = new ArrayList<>(Arrays.asList(address.split("[,.;] ", 7)));
        this.country = data.remove(0);
        this.region = data.remove(0);
        this.city = data.remove(0);
        this.street = data.remove(0);
        this.house = data.remove(0);
        this.corps = data.remove(0);
        this.apartment = data.remove(0);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (country != null && !country.isBlank()) {
            builder.append(country);
            builder.append(", ");
        }
        if (region != null && !region.isBlank()) {
            builder.append(region);
            builder.append(", ");
        }
        if (city != null && !city.isBlank()) {
            builder.append(city);
            builder.append(", ");
        }
        if (street != null && !street.isBlank()) {
            builder.append(street);
            builder.append(", ");
        }
        if (house != null && !house.isBlank()) {
            builder.append("д. ");
            builder.append(house);
            builder.append(", ");
        }
        if (corps != null && !corps.isBlank()) {
            builder.append("корп. ");
            builder.append(corps);
            builder.append(", ");
        }
        if (apartment != null && !apartment.isBlank()) {
            builder.append("кв. ");
            builder.append(apartment);
            builder.append(", ");
        }
        builder.delete(builder.length() - 2, builder.length() - 1);
        return builder.toString();
    }
}
