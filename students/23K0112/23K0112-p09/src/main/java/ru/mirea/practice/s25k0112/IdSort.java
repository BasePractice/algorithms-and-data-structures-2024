package ru.mirea.practice.s25k0112;

public final class IdSort {
    private IdSort() {

    }

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getId() > key.getId()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {new Student("Ali", 31, 3.5), new Student("John", 24, 3.8), new
                Student("Oleg", 1, 5.0), new Student("Roma", 191, 4.8)};

        for (Student student: students) {
            System.out.println(student.toString());
        }

        insertionSort(students);
        System.out.println("\n");

        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
}
