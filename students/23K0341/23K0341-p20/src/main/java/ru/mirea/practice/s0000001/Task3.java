package ru.mirea.practice.s0000001;

import java.io.Serializable;

/**
 * Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы оболочки, String),
 * V должен реализовать интерфейс Serializable и расширять класс Animal,
 * K
 */

public abstract class Task3 {
    public static void main(String[] args) {
        new Restricted<Double, String, Integer>(1.0, "bye", 69);
    }

    static class Restricted<T extends Comparable, V extends Serializable, K> {
        Restricted(T str, V ser, K none) {
            System.out.println(str);
            System.out.println(ser);
            System.out.println(none);
        }
    }
}
