package ru.mirea.practice.s23k0093;

public abstract class Main {
    public static void main(String[] args) {
        String[] shirts = {
            "S001,Black Polo Shirt,Black,XL",
            "S002,Black Polo Shirt,Black,L",
            "S003,Blue PoloShirt,Blue,XL",
            "S004,Blue PoloShirt,Blue,M",
            "S005,Tan PoloShirt,Tan,XL",
            "S006,Black T-Shirt,Black,XL",
            "S007,WhiteTShirt,White,XL",
            "S008,White T-Shirt,White,L",
            "S009,GreenT-Shirt,Green,S",
            "S010,Orange T-Shirt,Orange,S",
            "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirtObjects = new Shirt[shirts.length];

        for (int i = 0; i < shirts.length; i++) {
            String[] parts = shirts[i].split(",");
            shirtObjects[i] = new Shirt(parts[0], parts[1], parts[2], parts[3]);
        }

        for (Shirt shirt : shirtObjects) {
            System.out.println(shirt);
            System.out.println(); // Пустая строка для разделения рубашек
        }
    }
}
