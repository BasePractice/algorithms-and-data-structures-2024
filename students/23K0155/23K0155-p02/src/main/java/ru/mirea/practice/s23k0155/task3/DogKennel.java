package ru.mirea.practice.s23k0155.task3;

import java.util.Scanner;

public abstract class DogKennel {
    public static void main(String[] arg) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of dogs in the shelter: ");
            int number = scanner.nextInt();
            int age;
            String name;
            Dog[] kennel = new Dog[number];  // "массив собак"

            for (int i = 0; i < number; i++) {
                kennel[i] = new Dog("", 0);
                System.out.printf("Enter information dog %d\n", i + 1);
                System.out.print("Name:");
                name = scanner.nextLine();
                System.out.print("Age: ");
                age = scanner.nextInt();
                kennel[i].setInf(name, age);
            }

            System.out.print("Choose number dog: ");
            number = scanner.nextInt() - 1;
            System.out.println(kennel[number].toString());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
