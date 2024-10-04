package ru.mirea.practice.s23k0164.t56;

public class Product {
    public enum ListProduct {
        Product1("Умные наушники \"SoundWave Pro\"", 13688),
        Product2("Эко-сумка \"GreenBag\"", 1824),
        Product3("Косметический набор \"GlowUp\"",3649),
        Product4("Игровая консоль \"GameSphere X\"",45631);

        private final String name;
        private final int cost;


        ListProduct(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public int getCost() {
            return cost;
        }


    }
}
