package ru.mirea.practice.s230k754.lab4.task3;

import java.util.ArrayList;
import java.util.Collection;

public class Shopping extends User {
    private int cardMoney;
    private final Collection<String> card;

    Shopping(String login, String password) {
        super(login, password);
        this.card = new ArrayList<>();
        this.cardMoney = 0;
    }

    public void addCard(String clientProduct) {
        if (Products.contains(clientProduct)) {
            this.card.add(clientProduct);
            this.cardMoney += Products.valueOf(clientProduct).getPrice();
            System.out.println("Товар успешно добавлен");
        } else {
            System.out.println("Данного товара нет в магазине");
        }
    }

    public void buyCard() {
        System.out.println("Ваша цена: " + this.cardMoney);
        System.out.println("Ваши продукты: ");

        for (String obj: this.card) {
            System.out.println(obj);
        }

        this.card.clear();
        this.cardMoney = 0;
    }
}
