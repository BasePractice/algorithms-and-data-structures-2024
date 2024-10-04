package ru.mirea.practice.s23k0169.t2;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        SortingStudentsByGpa sortingStudents = new SortingStudentsByGpa();
        sortingStudents.setArray(3);
        System.out.println("Студенты без сортировки:");
        sortingStudents.outArray();

        System.out.println("\nСтуденты отсортированные по GPA (quicksort):");
        sortingStudents.quicksort();
        sortingStudents.outArray();

        System.out.println("\nСтуденты отсортированные по фамилии:");
        sortingStudents.sortByLastName();
        sortingStudents.outArray();

        System.out.println("\nСтуденты отсортированные по GPA (merge sort):");
        sortingStudents.mergeSort();
        sortingStudents.outArray();
    }
}
