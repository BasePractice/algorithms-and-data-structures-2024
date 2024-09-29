package ru.mirea.practice.s23k0143;

public abstract class AtelierTest {
    public static void main(String[] args) {
        Clothes[] clothesArray = {
                new TShirt(Size.M, 1000.0, "Синий"),
                new Pants(Size.L, 1500.0, "Красный"),
                new Skirt(Size.XXS, 1200.0, "Желтый"),
                new Tie(Size.XS, 5000.0, "Зелёный")
        };

        Atelier atelier = new Atelier();
        System.out.println("Одеваем женщину:");
        atelier.dressWomen(clothesArray);

        System.out.println("\nОдеваем мужчину:");
        atelier.dressMan(clothesArray);
    }
}
