package ru.mirea.practice.s23L0908;

/**
 * Напишите свою собственную реализацию интерфейса Comparable
 */

public class Task4 {
    interface MyComparable<T> {
        boolean equalTo(T other);

        boolean lessThanTo(T other);

        boolean lessThanOrEqualTo(T other);

        boolean moreThanTo(T other);

        boolean moreThanOrEqualTo(T other);
    }
}
