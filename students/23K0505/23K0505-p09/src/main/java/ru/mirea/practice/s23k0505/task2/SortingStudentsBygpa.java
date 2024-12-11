package ru.mirea.practice.s23k0505.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public abstract class SortingStudentsBygpa {
    public static <T> List<T> quicksort(List<T> array, Comparator<? super T> comparator) {
        if (array.size() <= 1) {
            return array;
        }
        int pivot = array.size() / 2;
        List<T> arraysmall = new ArrayList<>();
        List<T> arraybig = new ArrayList<>();
        for (T item : array) {
            if (item.equals(array.get(pivot))) {
                continue;
            } else if (comparator.compare(array.get(pivot), item) > 0) {
                arraysmall.add(item);
            } else if (comparator.compare(array.get(pivot), item) < 0) {
                arraybig.add(item);
            }
        }
        List<T> arraySorted = quicksort(arraysmall, comparator);
        arraySorted.add(array.get(pivot));
        arraySorted.addAll(quicksort(arraybig, comparator));
        return arraySorted;
    }

    public static void main(String[] args) {
        final Comparator<Student> comparator = new MathComparator().thenComparing(new PhysComparator().thenComparing(new CompSciComparator()
                .thenComparing(new PhylosophyComparator()))).reversed();

        Random random = new Random();
        String[] name = {"Коля", "Вася", "Петя", "Даша", "Саша", "Оля", "Наташа"};

        ArrayList<Student> students = new ArrayList<>();

        int size = 15;

        for (int i = 0; i < size; i++) {
            students.add(new Student(name[random.nextInt(name.length - 1)], String.format("23K%04d", size - i - 1), 17 + random.nextInt(3)));
        }

        for (Student student : students) {
            student.setGrades(random.nextFloat() * 3 + 2, random.nextFloat() * 3 + 2, random.nextFloat() * 3 + 2, random.nextFloat() * 3 + 2);
        }

        System.out.println(students.toString().replace("}, ", "}\n "));
        System.out.println();
        System.out.println(quicksort(students, comparator).toString().replace("}, ", "}\n "));
    }
}
