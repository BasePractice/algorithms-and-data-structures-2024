package ru.mirea.practice.s0000001.n4;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String data) {
        String[] parts = data.split(",");
        if (parts.length == 4) {
            id = parts[0].trim();
            name = parts[1].trim();
            color = parts[2].trim();
            size = parts[3].trim();
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n"
            + "Название: " + name + "\n"
            + "Цвет: " + color + "\n"
            + "Размер: " + size;
    }

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
            shirts[i] = new Shirt(shirtsData[i]);
        }

        for (Shirt shirt : shirts) {
            System.out.println(shirt);
            System.out.println("-----------");
        }
    }
}
