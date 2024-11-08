package ru.mirea.practice.s0000001;

import java.util.StringTokenizer;



public class Address {
    public String country;
    public String region;
    public String city;
    public String street;
    public String house;
    public String corpus;
    public String flat;

    public void parseAddressWithComma(String address) {
        String[] parts = address.split(",");
        if (parts.length > 0) {
            this.country = parts[0].trim();
        }
        if (parts.length > 1) {
            this.region = parts[1].trim();
        }
        if (parts.length > 2) {
            this.city = parts[2].trim();
        }
        if (parts.length > 3) {
            this.street = parts[3].trim();
        }
        if (parts.length > 4) {
            this.house = parts[4].trim();
        }
        if (parts.length > 5) {
            this.corpus = parts[5].trim();
        }
        if (parts.length > 6) {
            this.flat = parts[6].trim();
        }
    }

    public void parseAddressWithTokenizer(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
        int index = 0;

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();
            switch (index) {
                case 0:
                    this.country = token;
                    break;
                case 1:
                    this.region = token;
                    break;
                case 2:
                    this.city = token;
                    break;
                case 3:
                    this.street = token;
                    break;
                case 4:
                    this.house = token;
                    break;
                case 5:
                    this.corpus = token;
                    break;
                case 6:
                    this.flat = token;
                    break;
                default:
                    break;
            }
            index++;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (country != null && !country.isEmpty()) {
            result.append("Страна: ").append(country).append("\n");
        }

        if (region != null && !region.isEmpty()) {
            result.append("Регион: ").append(region).append("\n");
        }

        if (city != null && !city.isEmpty()) {
            result.append("Город: ").append(city).append("\n");
        }

        if (street != null && !street.isEmpty()) {
            result.append("Улица: ").append(street).append("\n");
        }

        if (house != null && !house.isEmpty()) {
            result.append("Дом: ").append(house).append("\n");
        }

        if (corpus != null && !corpus.isEmpty()) {
            result.append("Корпус: ").append(corpus).append("\n");
        }

        if (flat != null && !flat.isEmpty()) {
            result.append("Квартира: ").append(flat).append("\n");
        }

        return result.toString().trim();
    }
}
