package ru.mirea.practice.s23k0350.lab4.task2;

public class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes cloth : clothes) {
            if (cloth instanceof WomenClothing) {
                cloth.printInfo();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes cloth : clothes) {
            if (cloth instanceof MenClothing) {
                cloth.printInfo();
            }
        }
    }
}
