package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

// 5. Класс для пользовательского интерфейса
class LabClassUI {
    private Scanner scanner;
    private LabClass labClass;

    public LabClassUI(LabClass labClass) {
        this.scanner = new Scanner(System.in);
        this.labClass = labClass;
    }

    public void displayMenu() {
        System.out.println("1 - Add Student");
        System.out.println("2 - Sort Students by Average Score");
        System.out.println("3 - Search Student by Name");
        System.out.println("4 - Display Students");
        System.out.println("5 - Exit");
    }

    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        try {
            if (name.isEmpty()) {
                throw new EmptyStringException("Name cannot be empty!");
            }
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.print("Enter student average score: ");
        double score = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        Student student = new Student(name, score);
        labClass.addStudent(student);
    }

    public void searchStudent() {
        System.out.print("Enter student name to search: ");
        String name = scanner.nextLine();
        try {
            Student student = labClass.findStudentByName(name);
            System.out.println("Found: " + student);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showStudents() {
        labClass.displayStudents();
    }
}
