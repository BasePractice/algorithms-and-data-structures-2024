package ru.mirea.practice.s0000001;

public abstract class StudentSorter {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getidNumber() > key.getidNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {new Student(52, "Masha"), new Student(51, "Andrey"), new Student(54, "Leha"), new Student(53, "Krokodil")};

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nAfter sorting by iDNumber:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}