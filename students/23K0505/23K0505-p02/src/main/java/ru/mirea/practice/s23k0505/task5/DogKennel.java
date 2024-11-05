package ru.mirea.practice.s23k0505.task5;

import java.util.ArrayList;
import java.util.List;

public class DogKennel {
    List<Dog> dogs = new ArrayList<>();

    public void addDog(String name, int age) {
        dogs.add(new Dog(name, age));
    }

    public void addDogs(String[] names, int[] ages) {
        for (int i = 0; i < names.length; ++i) {
            dogs.add(new Dog(names[i], ages[i]));
        }
    }

    public void ageDogToHuman() {
        for (Dog dog : dogs) {
            dog.setHumanAge();
        }
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder("Собаки в питомнике:\n");
        for (Dog dog : dogs) {
            strBuilder.append(dog.getName()).append(" (").append(dog.getAge()).append(" лет)\n");
        }
        return strBuilder.toString();
    }
}
