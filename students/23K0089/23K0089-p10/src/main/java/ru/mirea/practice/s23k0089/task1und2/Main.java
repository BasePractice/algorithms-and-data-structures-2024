package ru.mirea.practice.s23k0089.task1und2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Main {
    static List<Student> students = new ArrayList<>();

    public static void setArray(int size) {
        Random random = new Random();
        String[] names = {"Студент", "Студентка", "Студентишка", "Студенчёнок", "Студентик"};
        String[] specialties = {"Мемология", "Конспирология", "Буфетная", "БегущийЗаМелом"};

        int groupNum;
        for (int i = 0; i < size; i++) {
            groupNum = random.nextInt(8);
            students.add(new Student(names[random.nextInt(names.length - 1)], "-", 17 + random.nextInt(3),
                    String.format("23K%04d", i + 100), specialties[groupNum / 2],
                    String.format("КВБО-%02d-23", groupNum + 1)));
        }
    }

    public static void main(String[] args) {
        setArray(10);

        for (Student student : students) {
            student.setGpa(Math.random() * 3f + 2);
        }
        System.out.println(Sort.quicksort(students, Sort.compareAll));
    }
}
