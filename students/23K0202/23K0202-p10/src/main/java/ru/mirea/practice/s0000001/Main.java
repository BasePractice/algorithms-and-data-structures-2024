package ru.mirea.practice.s0000001;

public abstract class Main {
    public static void main(String[] args) {
        SortingStudentByGpa sort = new SortingStudentByGpa();

        sort.setArray();

        System.out.println("Before: ");
        sort.outArray();

        sort.quickSort();
        System.out.println("\nSorting by GPA: ");
        sort.outArray();

        sort.sortByLastName();
        System.out.println("\nSorting by Last name: ");
        sort.outArray();

    }
}
