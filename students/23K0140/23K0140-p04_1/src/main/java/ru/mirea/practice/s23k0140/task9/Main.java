package ru.mirea.practice.s23k0140.task9;

public abstract class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Shelf chair = new Shelf("Дерево", "Бежевый", 4500);
        Table table = new Table("Дерево", "Коричневый", 10500);
        Sofa sofa = new Sofa("ЛДСП", "Белый", 25000);

        shop.addFurniture(chair);
        shop.addFurniture(table);
        shop.addFurniture(sofa);

        shop.presentShop();
    }
}