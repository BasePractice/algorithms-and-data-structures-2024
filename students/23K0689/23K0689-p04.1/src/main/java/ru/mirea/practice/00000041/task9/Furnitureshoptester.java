package ru.mirea.practice.s0000001.task9;

public final class Furnitureshoptester {

    private Furnitureshoptester() {
    }

    public static void main(String[] args) {
        Furnitureshop shop = new Furnitureshop();

        Furniture chair = new Chair("Стул офисный 'Трон начальника'", 2000);
        Furniture sofa = new Sofa("Диван угловой 'Ленивец-плюс'", 15000);
        Furniture table = new Table("Стол письменный 'Гора бумаг'", 7000);

        shop.addFurniture(chair);
        shop.addFurniture(sofa);
        shop.addFurniture(table);

        shop.showAllFurniture();
    }
}