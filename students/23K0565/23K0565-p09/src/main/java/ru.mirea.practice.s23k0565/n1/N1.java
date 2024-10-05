package ru.mirea.practice.s23k0565.n1;

import java.util.Arrays;

public final class N1 {
    private N1() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void sortInsert(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getIDnumber() > temp.getIDnumber()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(5),
            new Student(2),
            new Student(9),
            new Student(1),
            new Student(6)
        };

        sortInsert(students);

        System.out.println("Отсортированные iDnumber:");
        Arrays.stream(students)
                .map(Student::getIDnumber)
                .forEach(System.out::println);
    }
}