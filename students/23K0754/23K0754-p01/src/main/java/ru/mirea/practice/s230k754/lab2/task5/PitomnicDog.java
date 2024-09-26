package ru.mirea.practice.s230k754.lab2.task5;

public final class PitomnicDog {
    private PitomnicDog() {}

    public static void main(String[] args) {
        Dog[] arr = new Dog[3];
        arr[0] = new Dog("d1", 1);
        arr[1] = new Dog("d2", 2);
        arr[2] = new Dog("d3", 3);

        for (Dog dog : arr) {
            System.out.println(dog.toString());
        }
    }
}
