package ru.mirea.practice.s0000001.task3;

public abstract class FurnitureShopTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        shop.addFurniture(new Table("Oak Dining Table", 250, "oak"));
        shop.addFurniture(new Chair("Office Chair", 150, true));
        shop.addFurniture(new Sofa("Leather Sofa", 800, 3));

        shop.displayInventory();

        System.out.println("\nBuying a 'Office Chair':");
        shop.buyFurniture("Office Chair");

        System.out.println("\nRemaining inventory:");
        shop.displayInventory();
    }
}
