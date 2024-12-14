package ru.mirea.practice.s23l0908.task3;

import java.util.StringTokenizer;

public class Address {
    private final String country;
    private final String region;
    private final String city;
    private final String street;
    private final String house;
    private final String korpus;
    private final String room;

    public Address(String format) {
        String[] arrStr = format.split(",");
        if (arrStr.length >= 2) {
            this.country = arrStr[0];
            this.region = arrStr[1];
            this.city = arrStr[2];
            this.street = arrStr[3];
            this.house = arrStr[4];
            this.korpus = arrStr[5];
            this.room = arrStr[6];
        } else {
            StringTokenizer st = new StringTokenizer(format, ";", false);
            this.country = st.nextToken();
            this.region = st.nextToken();
            this.city = st.nextToken();
            this.street = st.nextToken();
            this.house = st.nextToken();
            this.korpus = st.nextToken();
            this.room = st.nextToken();
        }
    }

    public static void main(String[] args) {
        String format = "Russia; Russia; Moscow; Vernadskogo; D86;KPP2;5B";
        Address address = new Address(format);
        System.out.print(address);
    }

    public String toString() {
        return "Address{"
            + "country='"
            + country
            + '\''
            + ", region='"
            + region
            + '\''
            + ", city='"
            + city
            + '\''
            + ", street='"
            + street
            + '\''
            + ", house='"
            + house
            + '\''
            + ", korpus='"
            + korpus
            + '\''
            + ", room='"
            + room
            + '\''
            + '}';
    }
}
