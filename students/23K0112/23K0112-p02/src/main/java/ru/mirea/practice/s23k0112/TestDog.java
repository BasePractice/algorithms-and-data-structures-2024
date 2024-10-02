package ru.mirea.practice.s23k0112;

public final class TestDog {
    private TestDog() {

    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Ben", 7), new Dog("John", 2), new Dog("Casper", 4)};

        for (Dog dog : dogs) { // Enhanced for-loop for readability
            System.out.println(dog + "\n"); // Implicitly calls toString()
        }
    }
}