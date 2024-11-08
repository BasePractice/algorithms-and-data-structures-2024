package ru.mirea.practice.lab20.t1;

import java.io.Serializable;

class Dog implements Animal, Serializable {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
