package ru.mirea.practice.s23L0908;

public abstract class MainPrice {
    public static void main(String[] args) {
        Priceable carrot = new Carrot(50.0);
        Priceable cucumber = new Cucumber(30.0);
        Priceable tomato = new Tomato(70.0);

        System.out.println("Цена моркови: " + carrot.getPrice() + " руб/кг");
        System.out.println("Цена огурца: " + cucumber.getPrice() + " руб/кг");
        System.out.println("Цена помидора: " + tomato.getPrice() + " руб/кг");
    }
}
