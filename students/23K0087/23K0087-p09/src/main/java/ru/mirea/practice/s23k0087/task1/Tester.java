package ru.mirea.practice.s23k0087.task1;

public abstract class Tester {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student("Стас", 3314);
        students[1] = new Student("Денис", 1123);
        students[2] = new Student("Константин", 4123);
        students[3] = new Student("Глеб", 2322);
        students[4] = new Student("Аркадий", 5442);

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        IncertionSort.insertionSort(students);

        System.out.println("\nПосле сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
