package ru.mirea.practice.s23k0164.t3;

public class ListProduct {
    public enum Product {
        Product1("Умные наушники \"SoundWave Pro\"", 13688),
        Product2("Эко-сумка \"GreenBag\"", 1824),
        Product3("Косметический набор \"GlowUp\"",3649),
        Product4("Игровая консоль \"GameSphere X\"",45631);

        private final String name;
        private final int cost;


        Product(String name, int cost) {
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
