package ru.mirea.practice.s23l0908.task2;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Clothes[] c = new Clothes[4];
        c[0] = new TShirt(ClothingSize.XXS, 29.99, "Red");
        c[1] = new Pants(ClothingSize.M, 59.99, "Blue");
        c[2] = new Pants(ClothingSize.S, 39.99, "Black");
        // Skirt skirt = new Skirt(ClothingSize.S, 39.99, "Black");
        c[3] = new Tie(ClothingSize.L, 19.99, "Gray");

        Atelier atelier = new Atelier();

        for (Clothes cc : c) {
            if (cc instanceof WomenClothing) {
                atelier.dressWomen(cc);
            } else {
                atelier.dressMan(cc);
            }
            System.out.println();
        }
    }
}
