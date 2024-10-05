package ru.mirea.practice.s23L0908.pw41.task9;

public class Closet extends Furiture {
    private boolean mirorExist;
    private int countOfDoors;

    public boolean isMirorExist() {
        return mirorExist;
    }

    public void setMirorExist(boolean mirorExist) {
        this.mirorExist = mirorExist;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    public Closet(String color, double width, double lenght,
        String material, double price, boolean mirorExist, int countOfDoors) {
        super(color, width, lenght, material, price);
        this.mirorExist = mirorExist;
        this.countOfDoors = countOfDoors;
    }
}
