package ru.mirea.practice.s23l0908.task123;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    private static final String name = "meo";

    @Override
    public String toString() {
        return "Cat{"
            +
            "name='"
            + name
            + '\''
            +
            '}';
    }
}
