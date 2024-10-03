package ru.mirea.practice.s23k0140.task2;

public abstract class Main {
    public static void main(String[] args) {
        Pentagon pentagon = new Pentagon(2,6,"Белый");
        Hexagon hexagon = new Hexagon(-3,7, "Красный");
        Diamond diamond = new Diamond(4, -5, "Синий");

        pentagon.shape();
        hexagon.shape();
        diamond.shape();
    }
}