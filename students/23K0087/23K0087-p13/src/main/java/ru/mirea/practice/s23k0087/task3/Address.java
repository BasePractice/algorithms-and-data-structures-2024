package ru.mirea.practice.s23k0087.task3;

public class Address {
    String country;
    String city;
    String street;
    int houseNumber;
    int buildingNumber;

    public void setAddress(String address) {
        String[] parts = address.split(",");
        addressBuilder(parts);
    }


    public void setAddress(String address, char regex) {
        String[] parts = address.split(regex + "");
        addressBuilder(parts);
    }

    private void addressBuilder(String[] parts) {
        if (parts.length >= 4) {
            this.country = parts[0].trim();
            this.city = parts[1].trim();
            this.street = parts[2].trim();
            this.houseNumber = Integer.parseInt(parts[3].trim());
            if (parts.length > 4) {
                this.buildingNumber = Integer.parseInt(parts[4].trim());
            }
        }
    }

    @Override
    public String toString() {
        if (buildingNumber != 0) {
            return "Address[" + country + ", " + city + ", " + street + ", " + houseNumber + ", " + buildingNumber + "]";
        }
        return "Address[" + country + ", " + city + ", " + street + ", " + houseNumber + "]";
    }
}
