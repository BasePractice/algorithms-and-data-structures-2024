package ru.mirea.practice.s0000001.task1;

import java.io.Serializable;

class Cat implements Animal, Serializable {
    public void makeSound() {
        System.out.println("Meow");
    }
}
