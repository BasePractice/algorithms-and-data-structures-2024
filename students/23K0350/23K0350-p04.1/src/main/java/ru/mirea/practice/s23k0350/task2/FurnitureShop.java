package ru.mirea.practice.s23k0350.task2;

class FurnitureShop {
    private Furniture[] furniture;
    private int count;

    public FurnitureShop(int size) {
        furniture = new Furniture[size];
        count = 0;
    }

    public void addFurniture(Furniture furniture) {
        this.furniture[count++] = furniture;
    }

    public void printAllFurniture() {
        for (int i = 0; i < count; i++) {
            System.out.println("Тип: " + furniture[i].getType());
            System.out.println("Наименование: " + furniture[i].getName());
            System.out.println("Материал: " + furniture[i].getMaterial());
            System.out.println("Цена: " + furniture[i].getPrice());
            if (furniture[i] instanceof Table) {
                Table table = (Table) furniture[i];
                System.out.println("Длина: " + table.getLength());
                System.out.println("Ширина: " + table.getWidth());
            }
            System.out.println();
        }
    }
}
