package ru.mirea.practice.s23k0155.task3;

public class Adres {
    private String country;
    private String region;
    private String city;
    private String street;
    private String numberOfHouse;
    private String body;
    private String numberOfFlat;

    public Adres(String string) {
        string = string.replace('.', ',');
        string = string.replace(';', ',');
        String[] words = string.split(", ");
        this.country = words[0];
        this.region = words[1];
        this.city = words[2];
        this.street = words[3];
        this.numberOfHouse = words[4];
        this.body = words[5];
        this.numberOfFlat = words[6];


    }

    @Override
    public String toString() {
        return country + "\n" + region + "\n" + city + "\n" + street
                + "\n" + numberOfHouse + "\n" + body
                + "\n" + numberOfFlat;
    }
}
