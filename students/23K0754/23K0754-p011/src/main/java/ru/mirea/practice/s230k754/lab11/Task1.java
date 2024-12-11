package ru.mirea.practice.s230k754.lab11;

import java.util.Date;

public final class Task1 {
    private Task1() {}

    public static void main(String[] args) {
        Person person1 = new Person("Олег");

        person1.setEndTask();
        System.out.println(person1.getEndTask());

        Student s1 = new Student("Alex", new Date());
        System.out.println(s1.toString());

        TimerCode t1 = new TimerCode();
        t1.timerArrayList();
        t1.timerLinkedList();
    }
}
