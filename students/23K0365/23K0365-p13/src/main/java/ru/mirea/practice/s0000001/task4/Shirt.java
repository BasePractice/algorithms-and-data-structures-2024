package ru.mirea.practice.s0000001.task4;

public class Shirt {
    private String aryicul;
    private String label;
    private String color;
    private String size;

    public Shirt(String aryicul, String label, String color, String size) {
        this.aryicul = aryicul;
        this.label = label;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt\n"
                + "aryicul = " + aryicul + '\n'
                + "label: " + label + '\n'
                + "color - " + color + '\n'
                + "size = " + size + '\n';
    }
}
