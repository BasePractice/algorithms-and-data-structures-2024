package ru.mirea.practice.s0000001.task1;

public final class Main {

    private Main() {}

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].idNumber > key.idNumber) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(3, "Максим"),
            new Student(1, "Дима"),
            new Student(4, "Кирилл"),
            new Student(2, "Оля")
        };

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("После сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}