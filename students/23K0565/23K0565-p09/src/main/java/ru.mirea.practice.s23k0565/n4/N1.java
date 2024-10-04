package ru.mirea.practice.s23k0565.n4;

public abstract class N1 {
    public static void main(String[] args) {
        Student student1 = new Student(5, "Алиса");
        Student student2 = new Student(3, "Алексей");

        if (student1.compareTo(student2) > 0) {
            System.out.println(student1 + " идет после " + student2);
        } else if (student1.compareTo(student2) < 0) {
            System.out.println(student1 + " идет перед " + student2);
        } else {
            System.out.println(student1 + " равен " + student2);
        }
    }
}