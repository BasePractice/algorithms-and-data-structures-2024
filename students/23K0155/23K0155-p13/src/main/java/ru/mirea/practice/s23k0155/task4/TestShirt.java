package ru.mirea.practice.s23k0155.task4;

public abstract class TestShirt {
    public static void main(String[] args) {
        String[] shirtsData = {
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

        Shirt[] shirts = new Shirt[shirtsData.length];
        for (int i = 0; i < shirtsData.length; i++) {
            String[] shirtDetails = shirtsData[i].split(",");
            shirts[i] = new Shirt(shirtDetails[0], shirtDetails[1], shirtDetails[2], shirtDetails[3]);
        }

        for (Shirt shirt : shirts) {
            System.out.println(shirt);
            System.out.println("-----");
        }
    }
}


