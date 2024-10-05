package ru.mirea.practice.s23k0505.task2;

import ru.mirea.practice.s23k0505.task1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Main {
    static List<Student> students = new ArrayList<>();

    public static void setArray(int size) {
        Random random = new Random();
        String[] names = {"Николай", "Василий", "Пётр", "Дарья", "Александр", "Александра", "Ольга", "Наталья"};
        String[] specialties = {"ПИ", "ТСИИЗ", "ИСУОИ", "КС"};

        int groupNum;
        for (int i = 0; i < size; i++) {
            groupNum = random.nextInt(8);
            students.add(new Student(names[random.nextInt(names.length - 1)], "-", 17 + random.nextInt(3),
                    String.format("23K%04d", i + 100), specialties[groupNum / 2],
                    String.format("КВБО-%02d-23", groupNum + 1)));
        }
    }

    public static void main(String[] args) {
        setArray(100);

        for (Student student : students) {
            student.setGpa(Math.random() * 3f + 2);
        }
        System.out.println(Sort.quicksort(students, Sort.compareAll));
    }
}
