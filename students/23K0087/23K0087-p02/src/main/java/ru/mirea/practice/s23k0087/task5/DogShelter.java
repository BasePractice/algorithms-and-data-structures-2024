package ru.mirea.practice.s23k0087.task5;

public class DogShelter {
    private final Dog[] dogs;
    private int size;

    public DogShelter(int capacity) {
        dogs = new Dog[capacity];
        size = 0;
    }   

    public void addDog(Dog dog) {
        if (size < dogs.length) {
            dogs[size] = dog;
            size++;
        } else {
            System.out.println("Питомник полон, невозможно добавить новую собаку");
        }
    }

    public void addDogs(Dog[] newDogs) {
        int countAdded = 0;
        for (Dog newDog : newDogs) {
            addDog(newDog);
            countAdded++;
            if (size == dogs.length) {
                System.out.println("Питомник полон, невозможно добавить новую собаку");
                break;
            }
        }
        System.out.println("Добавлено " + countAdded + " собак");
    }

    public int getSize() {
        return size;
    }

    public Dog[] getDogs() {
        return dogs;
    }
}
