package ru.mirea.practice.s0000001.task1;

public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    public static Shirt[] convertToShirts(String[] shirts) {
        Shirt[] shirtArray = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            String[] details = shirts[i].split(",");
            shirtArray[i] = new Shirt(details[0], details[1], details[2], details[3]);
        }
        return shirtArray;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nDescription: " + description + "\nColor: " + color + "\nSize: " + size;
    }
}
