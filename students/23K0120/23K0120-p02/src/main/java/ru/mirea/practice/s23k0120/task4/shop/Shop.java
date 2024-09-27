package ru.mirea.practice.s23k0120.task4.shop;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop extends ArrayList<Item> {

    public Shop() {
        //Default Constructor
    }

    public Shop(Item[] items) {
        this.addAll(Arrays.asList(items));
    }

    public void remove(String name) {
        int i = 0;
        while (i < this.size()) {
            if (this.get(i).getName().equals(name)) {
                this.remove(this.get(i));
            }
            i++;
        }
    }

    public Shop findByName(String name) {
        Shop shopFound = new Shop();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getName().equals(name)) {
                shopFound.add(this.get(i));
            }
        }
        return shopFound;
    }

    public Shop findByCost(float cost) {
        Shop shopFound = new Shop();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCost() == cost) {
                shopFound.add(this.get(i));
            }
        }
        return shopFound;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            stringBuilder.append("\n").append(this.get(i));
        }
        return String.valueOf(stringBuilder);
    }
}
