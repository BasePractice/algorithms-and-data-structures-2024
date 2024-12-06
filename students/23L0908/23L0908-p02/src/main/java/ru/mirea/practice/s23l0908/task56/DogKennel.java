package ru.mirea.practice.s23l0908.task56;

import java.util.List;
import java.util.ArrayList;

public class DogKennel {
    private final List<Dog> dogs;

    public DogKennel() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void displayDogs() {
        System.out.println("Displaying all dogs in the kennel:");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }

    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();
        kennel.addDog(new Dog("Tyson", 3));
        kennel.addDog(new Dog("Hell", 4));

        kennel.displayDogs();
    }
}
