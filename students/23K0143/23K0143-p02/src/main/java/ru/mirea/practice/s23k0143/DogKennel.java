package ru.mirea.practice.s23k0143;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel extends ArrayList<Dog> {

    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Введите кличку собаки: ");
                String name = sc.nextLine();
                System.out.print("Введите возраст собаки: ");
                int age = sc.nextInt();
                sc.nextLine();
                Dog dog = new Dog(name, age);
                kennel.addDog(dog);
            }

            System.out.println("\nСписок собак в приюте:");
            kennel.displayDogs();

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public void addDog(Dog dog) {
        this.add(dog);
    }

    public void displayDogs() {
        for (Object obj : this) {
            Dog dog = (Dog) obj;
            System.out.println(dog);
        }
    }
}
