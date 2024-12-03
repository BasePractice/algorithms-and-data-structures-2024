package ru.mirea.practice.s0000001.task1;

public abstract class Test {
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(0);
        s[1] = new Student(2);
        s[2] = new Student(1);
        s[3] = new Student(3);
        System.out.println("");
        SortId sr = new SortId();
        sr.listStudents(s);
        System.out.println("");
        s = sr.idsort(s);
        sr.listStudents(s);

    }
}
