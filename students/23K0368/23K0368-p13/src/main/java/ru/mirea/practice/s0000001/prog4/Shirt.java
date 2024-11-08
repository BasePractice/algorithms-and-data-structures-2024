package ru.mirea.practice.s0000001.prog4;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String shirtInfo) {
        String[] parts = shirtInfo.split(",");
        if (parts.length != 4) {
            throw new IllegalArgumentException("Неверный формат строки: " + shirtInfo);
        }

        this.id = parts[0].trim();
        this.name = parts[1].trim();
        this.color = parts[2].trim();
        this.size = parts[3].trim();
    }

    @Override
    public String toString() {
        return "Shirt ID: " + id + "\n"
                + "Name: " + name + "\n"
                + "Color: " + color + "\n"
                + "Size: " + size;
    }
}
