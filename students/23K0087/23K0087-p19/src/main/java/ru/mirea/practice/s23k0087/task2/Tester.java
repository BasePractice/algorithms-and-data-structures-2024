package ru.mirea.practice.s23k0087.task2;

public abstract class Tester {
    public static void main(String[] args) {
        StudentCollection studentManager = new StudentManager();

        studentManager.addStudent(new Student("Милош Бикович", 3.5));
        studentManager.addStudent(new Student("Глеб Глебов", 4.8));
        studentManager.addStudent(new Student("Петр Петров", 3.9));

        System.out.println("Студенты перед сортировкой:");
        studentManager.printStudents();

        studentManager.sortStudentsByGpa();

        System.out.println("\nСтуденты после сортировки по среднему баллу:");
        studentManager.printStudents();

        try {
            Student foundStudent = studentManager.findStudentByName("Глеб Глебов");
            System.out.println("\nНайден студент: " + foundStudent);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            studentManager.findStudentByName("Иван Иванов");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
