package ru.mirea.practice.s23k0623;

public abstract class Test1Student {
    public static void main(String[] args) {
        Student student = new Student("104MN", "Иван", "Петров", "Инженер-программист", 3, "КВБО-01-25", 90);
        System.out.println(student);

        student.setFirstName("Григорий");
        student.setCourse(4);
        student.setGroup("КВБО-01-24");
        System.out.println(student);
    }
}
