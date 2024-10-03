package ru.mirea.practice.s0000002.task5;

public class PitomnicSobac {

    private Dog[] dogs;
    private int numberOfDogs;

    public PitomnicSobac(int size) {
        dogs = new Dog[size];
        numberOfDogs = 0;
    }

    public static void main(String[] args) {
        PitomnicSobac kennel = new PitomnicSobac(5);
        kennel.addDog(new Dog("Мухтар", 7));
        kennel.addDog(new Dog("САША", 5));
        kennel.printDogs();
    }

    public void addDog(Dog dog) {
        if (numberOfDogs < dogs.length) {
            dogs[numberOfDogs++] = dog;
        }
    }

    public void printDogs() {
        for (int i = 0; i < numberOfDogs; i++) {
            System.out.println(dogs[i]);
        }
    }
}
