package ru.mirea.practice.s23k0164.t2;

public final class Two {
    private Two(){

    }
    public static void main(String[] args) {
        Clothes[] clothingArray = {
                new TShirt(SizeClothers.ListSize.Size3, 5.99, "Красный"),
                new TShirt(SizeClothers.ListSize.Size4, 7.99, "Синий"),
                new Pants(SizeClothers.ListSize.Size2, 12.99, "Бежевые"),
                new Pants(SizeClothers.ListSize.Size5, 15.99, "Белые"),
                new Tie(SizeClothers.ListSize.Size3, 3.99, "Чёрный"),
                new Skirt(SizeClothers.ListSize.Size1, 6.99, "Жёлтая"),

        };

        Atelier atelier = new Atelier(clothingArray);
        System.out.println(SizeClothers.ListSize.Size1.getSize());

        atelier.dressWomen();
        atelier.dressMan();
    }
}
