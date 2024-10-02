package ru.mirea.practice.s23k0169.t3;

import java.util.Scanner;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите количество студентов в первом списке: ");
            int n1 = scanner.nextInt();
            scanner.nextLine();
            Student[] listA = new Student[n1];

            for (int i = 0; i < n1; i++) {
                System.out.print("Введите имя студента: ");
                final String firstName = scanner.nextLine();
                System.out.print("Введите фамилию студента: ");
                final String lastName = scanner.nextLine();
                System.out.print("Введите GPA студента: ");
                final double gpa = scanner.nextDouble();
                scanner.nextLine();
                listA[i] = new Student(firstName, lastName, gpa);
            }

            System.out.print("Введите количество студентов во втором списке: ");
            int n2 = scanner.nextInt();
            scanner.nextLine();
            Student[] listB = new Student[n2];

            for (int i = 0; i < n2; i++) {
                System.out.print("Введите имя студента: ");
                final String firstName = scanner.nextLine();
                System.out.print("Введите фамилию студента: ");
                final String lastName = scanner.nextLine();
                System.out.print("Введите GPA студента: ");
                final double gpa = scanner.nextDouble();
                scanner.nextLine();
                listB[i] = new Student(firstName, lastName, gpa);
            }

            MergeSort mergeSort = new MergeSort();
            Student[] combinedList = new Student[n1 + n2];
            System.arraycopy(listA, 0, combinedList, 0, n1);
            System.arraycopy(listB, 0, combinedList, n1, n2);
            Student[] sortedList = mergeSort.mergeSort(combinedList);

            System.out.println("\nСписок студентов после объединения и сортировки:");
            for (Student student : sortedList) {
                System.out.println(student);
            }
        }
    }
}

