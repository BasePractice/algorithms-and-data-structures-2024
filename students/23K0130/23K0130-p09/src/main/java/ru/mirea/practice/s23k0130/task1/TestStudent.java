package ru.mirea.practice.s23k0130.task1;

public final class TestStudent {

    private TestStudent() {

    }

    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student("Людмила", 5);
        students[1] = new Student("Надежда", 3);
        students[2] = new Student("Варвара", 4);
        students[3] = new Student("Савелий", 2);
        students[4] = new Student("Прохор", 1);

        System.out.println("Перед сортировкой:");
        for (Student student : students) {
            System.out.println(student);
        }

        Sorter.insertionSort(students);

        System.out.println("\nПосле сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
