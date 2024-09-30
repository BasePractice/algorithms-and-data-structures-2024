package ru.mirea.practice.s23k0143;

abstract class Furniture {
    protected String name;
    protected double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayInfo();
}


class Chair extends Furniture {
    private int legs;

    public Chair(String name, double price, int legs) {
        super(name, price);
        this.legs = legs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул: " + name + ", Цена: " + price + ", Ножки: " + legs);
    }
}

class Table extends Furniture {
    private String material;

    public Table(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол: " + name + ", Цена: " + price + ", Материал: " + material);
    }
}

class Sofa extends Furniture {
    private int cntSeat;

    public Sofa(String name, double price, int cntSeat) {
        super(name, price);
        this.cntSeat = cntSeat;
    }

    @Override
    public void displayInfo() {
        System.out.println("Диван: " + name + ", Цена: " + price + ", Вместимость: " + cntSeat);
    }
}
