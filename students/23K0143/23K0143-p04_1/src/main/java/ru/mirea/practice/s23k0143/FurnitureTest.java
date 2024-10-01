package ru.mirea.practice.s23k0143;

public abstract class FurnitureTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair1 = new Chair("Деревянный стул", 2000, 4);
        Chair chair2 = new Chair("Пластиковый стул", 500, 3);
        Table table = new Table("Столик", 15000, "Стекло");
        Sofa sofa = new Sofa("Диван", 27900, 5);

        shop.addFurniture(chair1);
        shop.addFurniture(chair2);
        shop.addFurniture(table);
        shop.addFurniture(sofa);

        System.out.println("Мебель в магазине:");
        shop.showAllFurniture();
    }
}
