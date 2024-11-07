package ru.mirea.practice.s0000001;

public abstract class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair = new Chair("Дерево", "Бежевый", 4500);
        Table table = new Table("Дерево", "Коричневый", 10500);
        Sofa sofa = new Sofa("ЛДСП", "Белый", 25000);

        shop.addFurniture(chair);
        shop.addFurniture(table);
        shop.addFurniture(sofa);

        shop.presentShop();
    }
}