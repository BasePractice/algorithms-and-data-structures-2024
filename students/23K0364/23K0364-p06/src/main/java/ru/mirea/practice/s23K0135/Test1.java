package ru.mirea.practice.s23K0135;

import java.util.ArrayList;
import java.util.List;

public abstract class Test1 {
    public static void main(String[] args) {
        List<Priceable> items = new ArrayList<>();

        items.add(new Product("lipstik", 5.99));
        items.add(new Product("Mascara", 3.99));
        items.add(new Service("Makeup", 30.50));
        items.add(new Service("Hair styling", 20.40));

        for (Priceable item : items) {
            System.out.println(item);
        }
    }
}

