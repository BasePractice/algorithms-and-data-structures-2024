package ru.mirea.practice.s0000001.task1;

public abstract class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student(3, "Тимур"),
            new Student(1, "Рома"),
            new Student(4, "Cлавик"),
            new Student(2, "Виталик")
        };

        System.out.println("Исходный массив:");
        printArray(students);

        insertionSort(students);

        System.out.println("Отсортированный массив:");
        printArray(students);
    }

    public static void insertionSort(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getId() > key.getId()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Метод для вывода массива
    public static void printArray(Student[] arr) {
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}
