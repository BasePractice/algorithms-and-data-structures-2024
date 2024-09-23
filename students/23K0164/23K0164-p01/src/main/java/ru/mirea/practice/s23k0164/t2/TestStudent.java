package ru.mirea.practice.s23k0164.t2;

public final class TestStudent {
    private TestStudent(){

    }
    public static void main(String[] args) {


        Student[] students = new Student[5];
        students[0] = new Student("Алиса", 3);
        students[1] = new Student("Саманта", 1);
        students[2] = new Student("Чарли", 4);
        students[3] = new Student("Диана", 2);
        students[4] = new Student("Ева", 5);

        System.out.println("Перед сортировкой:");
        for (Student student : students) {
            System.out.println(student);
        }

        QuickSort.quickSort(students, new SortingStudentsByGPA());

        System.out.println("\nПосле сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
