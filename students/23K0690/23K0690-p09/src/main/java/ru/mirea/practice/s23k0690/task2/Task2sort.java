package ru.mirea.practice.s23k0690.task2;

import java.util.Comparator;

class Task2sort implements Comparator<Task3student> {
    public int compare(Task3student s1, Task3student s2) {
        return Double.compare(s2.getAvg(), s1.getAvg());
    }
}