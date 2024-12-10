package ru.mirea.practice.s23k0505.task2;

import ru.mirea.practice.s23k0505.task3.Address;

public class Person {
    private String firstname;
    private String secondname;
    private String fathername;
    private Address address;

    public Person(String secondname) {
        this.secondname = secondname;
    }

    public Person(String firstname, String secondname, String fathername) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.fathername = fathername;
    }

    public Person(String firstname, String secondname, String fathername, Address address) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.fathername = fathername;
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getFathername() {
        return fathername;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        if (firstname != null && fathername != null) {
            return secondname + " " + firstname.charAt(0) + "." + fathername.charAt(0) + ".";
        } else {
            return secondname;
        }
    }
}
