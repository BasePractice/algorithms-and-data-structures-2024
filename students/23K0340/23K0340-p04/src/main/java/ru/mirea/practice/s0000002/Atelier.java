package ru.mirea.practice.s0000002;

class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes cloth : clothes) {
            if (cloth instanceof WomenClothing) {
                System.out.println(" - " + cloth.getClass().getSimpleName() + ": размер "
                        + cloth.getSize().getEuroSize() + ", цена " + cloth.getPrice() + ", цвет " + cloth.getColor());
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes cloth : clothes) {
            if (cloth instanceof MenClothing) {
                System.out.println(" - " + cloth.getClass().getSimpleName() + ": размер " + cloth.getSize().getEuroSize()
                        + ", цена " + cloth.getPrice() + ", цвет " + cloth.getColor());
            }
        }
    }
}