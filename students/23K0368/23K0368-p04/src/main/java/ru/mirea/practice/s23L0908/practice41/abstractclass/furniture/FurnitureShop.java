package ru.mirea.practice.s23L0908.practice41.abstractclass.furniture;

import java.util.Arrays;

public abstract class FurnitureShop {
    public static void main(String[] args) {
        Table table = new Table("стол 1", "Синий", 500, "Круглый");
        System.out.println(table);
        Table[] fura = new Table[5];
        fura[0] = table;
        fura[1] = new Table("стол 2", "Красный", 600, "Квадратный");
        fura[2] = new Table("стол 3", "Жёлтый", 700, "Прямоугольный");
        fura[3] = new Table("стол 4", "Зеленый", 800, "Сложной формы");
        fura[4] = new Table("стол 5", "Фиолетовый", 900, "Как стул вообще");

        Arrays.stream(fura).forEach(System.out::println);
    }
}
