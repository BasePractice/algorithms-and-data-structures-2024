package ru.mirea.practice.s0000001.practice41.student;

import java.util.Arrays;

public abstract class Undergraduate {
    public static void main(String[] args) {
        Undergraduateclass boy1 = new Undergraduateclass(10, "men", "Vadim", 4.5);
        System.out.println(boy1.toString());

        Student student1 = new Student(20, "men", "Ivan", "KABO-02-23", 2);
        System.out.println(student1.toString());

        Schoolboy shoolboy1 = new Schoolboy(7, "men", "Oleg", "1Б", "Elena");
        System.out.println(shoolboy1.toString());

        Undergraduateclass[] undergraduateClasses = new Undergraduateclass[5];
        undergraduateClasses[0] = student1;
        undergraduateClasses[1] = shoolboy1;
        System.out.println(Arrays.toString(undergraduateClasses));
    }
}
