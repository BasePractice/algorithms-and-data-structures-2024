package ru.mirea.practice.s23k0350.lab4pt1.task2;

class Sofa extends Furniture {
    public Sofa(String name, String material, double price) {
        super(name, material, price);
    }

    @Override
    public String getType() {
        return "Диван";
    }
}
