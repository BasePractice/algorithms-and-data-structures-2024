package ru.mirea.practice.s0000002.task3;

public class Chair extends Furniture {
    private boolean hasArmrests;

    public Chair(String name, double price, boolean hasArmrests) {
        super(name, price);
        this.hasArmrests = hasArmrests;
    }

    @Override
    public String getDescription() {
        return "This is a chair named " + name + (hasArmrests ? " with armrests." : " without armrests.");
    }
}
