package ru.mirea.practice.lab13;

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
        } else {
            System.out.println("Неверный формат строки");
        }
    }

    @Override
    public String toString() {
        return "Shirt{"
                + "id='" + id + '\''
                + ", name='" + name + '\''
                + ", color='" + color + '\''
                + ", size='" + size + '\''
                + '}';
    }

    public static void main(String[] args) {
        String[] shirtsData = {
            "S001,Black Polo Shirt,Black,XL",
            "S002,Black Polo Shirt,Black,L",
            "S003,Blue Polo Shirt,Blue,XL",
            "S004,Blue Polo Shirt,Blue,M",
            "S005,Tan Polo Shirt,Tan,XL"
        };

        Shirt[] shirts = new Shirt[shirtsData.length];
        for (int i = 0; i < shirtsData.length; i++) {
            shirts[i] = new Shirt(shirtsData[i]);
            System.out.println(shirts[i]);
        }
    }
}
