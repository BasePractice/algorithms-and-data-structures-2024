package ru.mirea.practice.u23k1158.t4;

public abstract class Main {

    public static void main(String[] args) {
        Priceable armchair = new Armchair(7990);
        Priceable bed = new Bed(30990);
        Priceable wardrobe = new Wardrobe(15990);

        System.out.println("Цена кресла: " + armchair.getPrice() + " руб");
        System.out.println("Цена кровати: " + bed.getPrice() + " руб");
        System.out.println("Цена шкафа: " + wardrobe.getPrice() + " руб");
    }
}
