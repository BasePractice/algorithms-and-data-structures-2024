package ru.mirea.practice.s23k0350.lab4.task2;

public abstract class Main {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[] {
            new TShirt(ClothingSize.S, 20.0, "Белый"),
            new Pants(ClothingSize.M, 30.0, "Черный"),
            new Skirt(ClothingSize.L, 40.0, "Красный"),
            new Tie(ClothingSize.XS, 10.0, "Синий"),
            new TShirt(ClothingSize.XXS, 15.0, "Зеленый"),
            new Pants(ClothingSize.L, 35.0, "Бежевый"),
            new Skirt(ClothingSize.S, 25.0, "Желтый"),
            new Tie(ClothingSize.M, 12.0, "Коричневый")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }
}