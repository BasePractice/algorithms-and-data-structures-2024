package ru.mirea.practice.s23k0623;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Task4 {
    private String[] shop;
    private int count;

    public Task4(int countComputers) {
        this.shop = new String[countComputers];
        this.count = 0;

    }

    public void append() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите название компьютера: ");
            String computerName = scanner.nextLine();
            if (count == shop.length) {
                System.out.println("Массив переполнен");
                return;
            }
            this.shop[count] = computerName;
            count++;
        }
    }

    public String find(String compName) {
        for (int i = 0; i < count; i++) {
            if (Objects.equals(shop[i], compName)) {
                return compName;
            }
        }
        return "0";
    }


    public void pop() {
        this.shop = Arrays.copyOf(this.shop, this.shop.length - 1);
        count--;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < count; i++) {
            str += shop[i] + " \n";
        }
        return str;
    }
}