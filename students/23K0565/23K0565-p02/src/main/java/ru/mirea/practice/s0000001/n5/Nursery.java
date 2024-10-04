package ru.mirea.practice.s0000001.n5;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Nursery {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Введите количество собак:");
            int n = sc.nextInt();
            Dog[] dogs = new Dog[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Введите кличку собаки и её возраст:");
                String name = sc.next();
                int age = sc.nextInt();
                dogs[i] = new Dog(name, age);
            }
            System.out.println("Информация о собаках: ");
            System.out.println(Arrays.toString(dogs));
        }
    }
}