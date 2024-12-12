package ru.mirea.practice.s23k0145.lab2;

public class CustomFurnitureFactory extends FurnitureFactory {
    @Override
    RetroSofa createRetroSofa(int durability) {
        return new RetroSofa(durability);
    }

    @Override
    EnchantedTable createEnchantedTable() {
        return new EnchantedTable();
    }

    @Override
    UtilityStool createUtilityStool() {
        return new UtilityStool();
    }
}
