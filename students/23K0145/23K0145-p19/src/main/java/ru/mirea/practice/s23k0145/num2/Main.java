package ru.mirea.practice.s23k0145.num2;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        StudentCollection studentManager = new StudentManager();

        studentManager.addStudent(new Student("Иван Иванов", 3.5));
        studentManager.addStudent(new Student("Анна Каренина", 4.8));
        studentManager.addStudent(new Student("Петр Петров", 3.9));

        System.out.println("Студенты перед сортировкой:");
        studentManager.printStudents();

        studentManager.sortStudentsByGpa();

        System.out.println("\nСтуденты после сортировки по среднему баллу:");
        studentManager.printStudents();

        try {
            Student foundStudent = studentManager.findStudentByName("Анна Каренина");
            System.out.println("\nНайден студент: " + foundStudent);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            studentManager.findStudentByName("Алексей Морозов");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
