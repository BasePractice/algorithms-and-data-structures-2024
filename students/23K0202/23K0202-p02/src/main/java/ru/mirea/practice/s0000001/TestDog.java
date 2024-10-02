package ru.mirea.practice.s0000001;


public abstract class TestDog {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Kapa", 3), new Dog("Barkhan", 1), new Dog("Tesla", 7)};

        for (Dog dog : dogs) {
            String sms = dog.toString();
            System.out.println(sms);
        }
    }

}