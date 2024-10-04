package ru.mirea.practice.s0000001;

public abstract class Tester {
    public static Student[] unite(Student[] students1, Student[] students2) {
        SortingStudentsByGpa test = new SortingStudentsByGpa();
        Student[] students = new Student[students1.length + students2.length];
        int n = students1.length + students2.length;
        for (int i = 0;i < students1.length;i++) {
            students[i] = students1[i];
        }
        for (int j = 0;j < students2.length;j++) {
            students[j + students1.length] = students2[j];
        }
        test.qsort(students, 0, n);
        return students;
    }

    public static void main(String[] args) {
        SortingStudentsByGpa test = new SortingStudentsByGpa();
        Student[] mas1 = new Student[0];
        test.setIdnum(mas1,3);
        for (int i = 0;i < 3;i++) {
            System.out.print(mas1[i].toString() + " ");
        }
        test.qsort(mas1,0,3);
        for (int i = 0;i < 5;i++) {
            System.out.print(mas1[i].toString() + " ");
        }
        Student[] mas2 = new Student[0];
        test.setIdnum(mas2, 5);
        test.outArray(unite(mas1,mas2),8);
    }
}
