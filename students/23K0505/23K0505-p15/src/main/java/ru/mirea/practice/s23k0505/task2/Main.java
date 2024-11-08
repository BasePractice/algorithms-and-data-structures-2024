package ru.mirea.practice.s23k0505.task2;

public abstract class Main {
    public static void main(String[] args) {
        Country[] countries = {new Country("Australia", "Kangaroos live here"),
            new Country("Russia", "Bears live here"),
            new Country("China", "Kangaroos live here"),
            new Country("India", "Elephants live here")};
        ComboFrame frame = new ComboFrame(countries);
        frame.setVisible(true);
    }
}
