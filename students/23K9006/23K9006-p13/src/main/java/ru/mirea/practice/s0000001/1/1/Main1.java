package ru.mirea.practice.s0000001;

import java.util.Locale;

public final class Main1 {
    private Main1() {}

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
            String[] parts = shirts[i].split(",");
            String id = parts[0];
            String name = parts[1];
            String color = parts[2];
            String size = parts[3];

            if (name.toLowerCase(Locale.ROOT).contains("polo")) {
                shirtArray[i] = new PoloShirt(id, name, color, size);
            } else {
                shirtArray[i] = new TShirt(id, name, color, size);
            }
        }

        for (Shirt shirt : shirtArray) {
            System.out.println(shirt);
        }
    }
}
