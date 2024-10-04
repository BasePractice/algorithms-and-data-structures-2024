package ru.mirea.practice.pr9;

public abstract class TestStudent {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(105, "Ivan");
        students[1] = new Student(102, "Maria");
        students[2] = new Student(110, "Peter");
        students[3] = new Student(101, "Anna");
        students[4] = new Student(108, "John");

        System.out.println("Before sorting:");
        printStudents(students);

        insertionSort(students);

        System.out.println("\nAfter sorting by iDNumber:");
        printStudents(students);
    }

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIdNumber() > key.getIdNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
