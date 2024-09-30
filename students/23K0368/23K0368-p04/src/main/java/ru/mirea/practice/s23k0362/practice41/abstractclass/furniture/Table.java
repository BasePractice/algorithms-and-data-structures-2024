package ru.mirea.practice.s23k0362.practice41.abstractclass.furniture;

class Table extends Furniture {
    public String model;

    public Table(String name, String color, int price, String model) {
        super(name, color, price);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Table{" + "name='" + name + '\''
                + ", color='" + color + '\''
                + ", price=" + price + '\''
                + "model='" + model + '\''
                + '}';
    }
}
