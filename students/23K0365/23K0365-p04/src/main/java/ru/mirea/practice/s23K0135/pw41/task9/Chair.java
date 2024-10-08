package ru.mirea.practice.s23K0135.pw41.task9;

public class Chair extends Furiture {
    boolean chairBackExist;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Chair(String color, double width, double lenght,
        String material, double price, boolean chairBackExist) {
        super(color, width, lenght, material, price);
        this.chairBackExist = chairBackExist;
    }
}
