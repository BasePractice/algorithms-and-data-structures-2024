package ru.mirea.practice.s0000001;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String id, String name, String color, String size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt ID: " + id + "\n"
            + "Name: " + name + "\n"
            + "Color: " + color + "\n"
            + "Size: " + size;
    }

    public static void main(String[] args) {
        String[] shirts = {
            "S001,Black Polo Shirt,Black,XL",
            "S002,Black Polo Shirt,Black,L",
            "S003,Blue Polo Shirt,Blue,XL",
            "S004,Blue Polo Shirt,Blue,M",
            "S005,Tan Polo Shirt,Tan,XL",
            "S006,Black T-Shirt,Black,XL",
            "S007,White T-Shirt,White,XL",
            "S008,White T-Shirt,White,L",
            "S009,Green T-Shirt,Green,S",
            "S010,Orange T-Shirt,Orange,S",
            "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirtArray = new Shirt[shirts.length];

        for (int i = 0; i < shirts.length; i++) {
            String[] shirtDetails = shirts[i].split(",");
            shirtArray[i] = new Shirt(shirtDetails[0], shirtDetails[1], shirtDetails[2], shirtDetails[3]);
        }

        for (Shirt shirt : shirtArray) {
            System.out.println(shirt);
            System.out.println();
        }
    }
}
