package ru.mirea.practice.s23k0505.task3;

import ru.mirea.practice.s23k0505.task1.Student;
import ru.mirea.practice.s23k0505.task2.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class MergeStudents {
    public static List<Student> setArray(int size) {
        List<Student> students = new ArrayList<>();
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
        return students;
    }

    public static void main(String[] args) {
        List<Student> students1 = setArray(20);
        List<Student> students2 = setArray(20);

        for (Student student : students1) {
            student.setGpa(Math.random() * 3f + 2);
        }
        for (Student student : students2) {
            student.setGpa(Math.random() * 3f + 2);
        }

        List<Student> students = Sort.mergeLists(students1, students2, Sort.compareGroup);

        System.out.println(students);
    }
}
