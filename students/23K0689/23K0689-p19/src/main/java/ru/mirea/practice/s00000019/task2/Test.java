package ru.mirea.practice.s0000001.task2;

public abstract class Test {
    public static void main(String[] args) {
        Student[] s = new Student[4];
        final SortId sr = new SortId();
        s[0] = new Student(0,"a");
        s[1] = new Student(2,"b");
        s[2] = new Student(1,"c");
        s[3] = new Student(3,"d");
        sr.listStudents(s);
        System.out.println("");
        s = sr.idsort(s);
        sr.listStudents(s);
        System.out.println("");
        System.out.println(sr.findStudent(s,"b"));
        sr.findStudent(s,"e");

    }
}
