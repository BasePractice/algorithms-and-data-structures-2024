package ru.mirea.practice.s230k754.lab3.formatenter;

import java.util.Objects;

public class Shop {

    private Object[][] items;
    private int count;
    private int balance = 0;

    public Shop(int count) {
        this.items = new Object[count][2];
        this.count = 0;
    }

    public void append(String nameItem, int prise) {
        this.items[count][0] = nameItem;
        this.items[count][1] = prise;
        count++;
    }

    public void buy(String nameItem, String currency) {
        for (Object[] obj: this.items) {
            if (Objects.equals(obj[0], nameItem)) {
                this.balance += Convertor.setPrise((int)obj[1], currency);
            }
        }
    }

    public int getBalance() {
        return balance;
    }
}
