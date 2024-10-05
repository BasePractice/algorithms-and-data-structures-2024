package ru.mirea.practice.s23L0908.task9;


public class Sofa extends Furniture {

    public Sofa(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Это диван. Отличен для отдыха и сна.";
    }
}
