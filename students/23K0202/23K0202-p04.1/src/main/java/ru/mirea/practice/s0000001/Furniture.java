package ru.mirea.practice.s0000001;

public abstract class Furniture {
    protected String material;
    protected String colour;
    protected double price;

    public Furniture(String material, String colour, double price){
        this.material = material;
        this.colour = colour;
        this.price = price;
    }
    public abstract void furniture();
}

class Chair extends Furniture{
    public Chair(String material, String color, double price) {
        super(material, color, price);
    }

    public void furniture() {
        System.out.println("Позиция - Стул" + "\nМатериал: " + material + "\nЦвет: " + colour + "\nЦена: " + price);
    }
}

class Table extends Furniture{
    public Table(String material, String color, double price) {
        super(material, color, price);
    }

    public void furniture() {
        System.out.println("Позиция - Стол" + "\nМатериал: " + material + "\nЦвет: " + colour + "\nЦена: " + price);
    }
}

class Sofa extends Furniture{
    public Sofa(String material, String color, double price) {
        super(material, color, price);
    }
    public void furniture() {
        System.out.println("Позиция - Диван" + "\nМатериал: " + material + "\nЦвет: " + colour + "\nЦена: " + price);
    }
}