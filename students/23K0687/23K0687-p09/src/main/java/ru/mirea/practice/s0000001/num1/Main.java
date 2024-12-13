package ru.mirea.practice.s0000001.num1;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(3, "Alice"),
            new Student(1, "Bob"),
            new Student(2, "Charlie")
        };

        insertionSort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getId() > key.getId()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }
}
