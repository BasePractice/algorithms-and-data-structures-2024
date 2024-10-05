package ru.mirea.practice.s23L0908.task6to9;

public class Shop implements Printable {
    private String name;
    private int yearOfOpen;

    public Shop(String name, int yearOfOpen) {
        this.name = name;
        this.yearOfOpen = yearOfOpen;
    }

    @Override
    public void print() {
        System.out.println("Name of shop is "
                + name + ". It has been found in "
                + yearOfOpen);
    }
}
