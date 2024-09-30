package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogKennel {
    private List<Dog> dogs;

    public DogKennel() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void displayDogs() {
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }

    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();

        try (Scanner scanner = new Scanner(System.in)) {
            // Добавление собак
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter dog's name: ");
                String name = scanner.nextLine();
                System.out.print("Enter dog's age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // очистка буфера

                Dog dog = new Dog(name, age);
                kennel.addDog(dog);
            }

            // Отображение всех собак
            System.out.println("\nDogs in the kennel:");
            kennel.displayDogs();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
