package ru.mirea.practice.s23k0505.task3;

import ru.mirea.practice.s23k0505.task2.Student;
import ru.mirea.practice.s23k0505.task2.MathComparator;
import ru.mirea.practice.s23k0505.task2.PhysComparator;
import ru.mirea.practice.s23k0505.task2.CompSciComparator;
import ru.mirea.practice.s23k0505.task2.PhylosophyComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public abstract class MergeStudents {
    public static <T> List<T> mergeSort(List<T> array, Comparator<? super T> comparator) {
        if (array.size() == 1) {
            return array;
        }
        List<T> arrayright = new ArrayList<>();
        List<T> arrayleft = new ArrayList<>();
        for (int i = 0; i < array.size() / 2; i++) {
            arrayleft.add(array.get(i));
        }
        for (int i = array.size() / 2; i < array.size(); i++) {
            arrayright.add(array.get(i));
        }
        arrayleft = mergeSort(arrayleft, comparator);
        arrayright = mergeSort(arrayright, comparator);

        ArrayList<T> arraySorted = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arrayleft.size() && j < arrayright.size()) {
            if (comparator.compare(arrayleft.get(i), arrayright.get(j)) <= 0) {
                arraySorted.add(arrayleft.get(i));
                i++;
            } else if (comparator.compare(arrayleft.get(i), arrayright.get(j)) > 0) {
                arraySorted.add(arrayright.get(j));
                j++;
            }
        }
        if (i >= arrayleft.size()) {
            while (j < arrayright.size()) {
                arraySorted.add(arrayright.get(j));
                j++;
            }
        } else if (j >= arrayright.size()) {
            while (i < arrayleft.size()) {
                arraySorted.add(arrayleft.get(i));
                i++;
            }
        }
        return arraySorted;
    }

    public static void main(String[] args) {
        final Comparator<Student> comparator = new MathComparator().thenComparing(new PhysComparator().thenComparing(new CompSciComparator()
                .thenComparing(new PhylosophyComparator()))).reversed();
        Random random = new Random();
        String[] name = {"Коля", "Вася", "Петя", "Даша", "Саша", "Оля", "Наташа"};

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> students1 = new ArrayList<>();

        int size = 5;

        for (int i = 0; i < size; i++) {
            students.add(new Student(name[random.nextInt(name.length - 1)], String.format("23K%04d", i), 17 + random.nextInt(3)));
        }

        for (int i = size; i < size * 2; i++) {
            students1.add(new Student(name[random.nextInt(name.length - 1)], String.format("23K%04d", i), 17 + random.nextInt(3)));
        }

        for (Student student : students) {
            student.setGrades(random.nextFloat() * 3 + 2, random.nextFloat() * 3 + 2, random.nextFloat() * 3 + 2, random.nextFloat() * 3 + 2);
        }
        for (Student student : students1) {
            student.setGrades(random.nextFloat() * 3 + 2, random.nextFloat() * 3 + 2, random.nextFloat() * 3 + 2, random.nextFloat() * 3 + 2);
        }

        //System.out.println(mergeSort(students, comparator).toString().replace("}, ", "}\n "));

        List<Student> studentArrayList = new ArrayList<>();
        studentArrayList.addAll(students);
        studentArrayList.addAll(students1);
        studentArrayList = mergeSort(studentArrayList, comparator);

        System.out.println(studentArrayList.toString().replace("}, ", "}\n "));
    }
}
