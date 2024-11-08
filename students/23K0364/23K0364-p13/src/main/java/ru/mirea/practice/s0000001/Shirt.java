package ru.mirea.practice.s0000001;

class Shirt {
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

    @Override
    public String toString() {
        return "Shirt ID: " + id + "\nDescription: " + description + "\nColor: " + color + "\nSize: " + size;
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
            String[] parts = shirts[i].split(",");
            shirtArray[i] = new Shirt(parts[0], parts[1], parts[2], parts[3]);
        }

        for (Shirt shirt : shirtArray) {
            System.out.println(shirt);
        }
    }
}

