package ru.mirea.practice.s23k0215.task2;



import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass;
    private Scanner scanner;

    public LabClassUI() {
        labClass = new LabClass();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("1. Добавить студента");
            System.out.println("2. Найти студента");
            System.out.println("3. Сортировать студентов");
            System.out.println("4. Выход");
            System.out.print("Выберите опцию: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    findStudent();
                    break;
                case 3:
                    sortStudents();
                    break;
                case 4:
                    System.out.println("Выход...");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
                    break;
            }
        }
    }

    private void addStudent() {
        System.out.print("Введите ФИО студента: ");
        String fullName = scanner.nextLine();
        System.out.print("Введите средний балл студента: ");
        double averageGrade = scanner.nextDouble();
        scanner.nextLine();
        labClass.addStudent(new Student(fullName, averageGrade));
        System.out.println("Студент добавлен.");
    }

    private void findStudent() {
        System.out.print("Введите ФИО студента для поиска: ");
        String fullName = scanner.nextLine();
        try {
            Student student = labClass.findStudent(fullName);
            System.out.println("Студент найден: " + student.getFullName() + ", Средний балл: " + student.getAverageGrade());
        } catch (StudentNotFoundException | EmptyStringException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void sortStudents() {
        System.out.println("Сортировка студентов по среднему баллу...");
        labClass.sortStudentsByAverageGrade();
        System.out.println("Студенты отсортированы.");
        for (Student student : labClass.sortStudentsByAverageGrade()) {
            System.out.println(student.getFullName() + ": " + student.getAverageGrade());
        }
    }
}

