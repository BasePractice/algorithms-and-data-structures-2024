package ru.mirea.practice.s23k0350.task1;


public class Shirt {
    String id;
    String type;
    String color;
    String size;

    public Shirt(String id, String type, String color, String size) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return "Товар номер "
                + getId()
                + "\n"
                + getType()
                + " - Тип товара\n"
                + getColor()
                + " - Цвет товара\n"
                + getSize()
                + " - Размер товара\n";
    }
}
