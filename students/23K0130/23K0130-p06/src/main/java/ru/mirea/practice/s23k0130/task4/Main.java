package ru.mirea.practice.s23k0130.task4;

public abstract class Main {
    public static void main(String[] args) {
        Priceable armchair = new Armchair(5000);
        Priceable bed = new Bed(25000);
        Priceable wardrobe = new Wardrobe(20000);

        System.out.println("Цена кресла: " + armchair.getPrice() + " руб");
        System.out.println("Цена кровати: " + bed.getPrice() + " руб");
        System.out.println("Цена шкафа: " + wardrobe.getPrice() + " руб");
    }
}
