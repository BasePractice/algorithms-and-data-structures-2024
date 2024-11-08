package ru.mirea.practice.s0000001.n2;

import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass = new LabClass();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Введите ФИО: ");
        String fio = scanner.nextLine();
        System.out.print("Введите средний балл: ");
        double averageScore = scanner.nextDouble();
        scanner.nextLine(); // очистка буфера
        labClass.addStudent(new Student(fio, averageScore));
        System.out.println("Студент добавлен.");
    }

    public void sortStudents() {
        labClass.sortStudentsByScore();
        System.out.println("Студенты отсортированы по среднему баллу.");
    }

    public void findStudent() {
        System.out.print("Введите ФИО для поиска: ");
        String fio = scanner.nextLine();
        try {
            Student student = labClass.findStudentByFio(fio);
            System.out.println("Найден студент: " + student.getFio() + ", Средний балл: " + student.getAverageScore());
        } catch (NStudent | EmpString e) {
            System.out.println(e.getMessage());
        }
    }
}
