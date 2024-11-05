package mirea.lab9;

/* Написать тестовый класс, который создает массив класса Student и
сортирует массив iDNumber и сортирует его вставками. */

import java.util.Arrays;

public abstract class Prac9p1 {
    public static void main(String[] args) {
        Student[] students = new Student[]{
            new Student(289, 3),
            new Student(190, 5),
            new Student(111, 1),
            new Student(100, 11)
        };
        for (int i = 1; i < students.length; i++) {
            Student c = students[i];
            int j = i - 1;
            for (; j >= 0 && c.compareTo(students[j]) < 0; j--) {
                students[j + 1] = students[j];
            }
            students[j + 1] = c;
        }
        System.out.println(Arrays.toString(students));
    }
}
