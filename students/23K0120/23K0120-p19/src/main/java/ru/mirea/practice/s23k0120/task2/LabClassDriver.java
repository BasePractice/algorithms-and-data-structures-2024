package ru.mirea.practice.s23k0120.task2;

import java.util.Locale;
import java.util.Scanner;

public class LabClassDriver {
    private final LabClassUI labClassUI;

    LabClassDriver(LabClassUI labClassUI) {
        this.labClassUI = labClassUI;
    }

    LabClassDriver() {
        labClassUI = new LabClassUI();
    }

    public void run(Scanner scanner) {
        String input;
        do {
            System.out.print("\nChoose an option: " + "\nPRINT: print the lab class list" + "\nSORT: sorts the list by grade"
                + "\nADD: add student" + "\nREMOVE: remove student" + "\nFIND: find student(s)" + "\nEXIT: exit program" + "\nOption: ");
            input = scanner.nextLine();
            switch (input.toLowerCase(Locale.US)) {
                case "print":
                    System.out.println(labClassUI);
                    break;
                case "sort":
                    labClassUI.sort();
                    break;
                case "add":
                    addStudent(scanner);
                    break;
                case "remove":
                    removeStudent(scanner);
                    break;
                case "find":
                    find(scanner);
                    break;
                default: continue;
            }
        } while (!"exit".equalsIgnoreCase(input));
    }

    private void removeStudent(Scanner scanner) {
        System.out.println("Enter student name: ");
        boolean inputSuccess = false;
        while (!inputSuccess) {
            String name = scanner.nextLine();
            try {
                labClassUI.removeStudentByName(name);
                inputSuccess = true;
            } catch (LabClassUI.EmptyStringException e) {
                System.out.println(e.getMessage());
                System.out.println("Enter student name again:");
            } catch (LabClassUI.StudentNotFoundException e) {
                System.out.println("No such students found");
                inputSuccess = true;
            }
        }
    }

    public void addStudent(Scanner scanner) {
        boolean inputSuccess = false;
        while (!inputSuccess) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student grade: ");
            String averageGrade = scanner.nextLine();
            try {
                labClassUI.addStudent(name, averageGrade);
                inputSuccess = true;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Enter student info again\n");
            }
        }
    }

    public void find(Scanner scanner) {
        while (true) {
            System.out.println("Enter \"exit\" to exit");
            System.out.print("Search by [name/grades]: ");
            String input = scanner.nextLine();
            switch (input.toLowerCase(Locale.US)) {
                case "exit":
                    return;
                case "name":
                    findByName(scanner);
                    return;
                case "grades":
                    findByGrade(scanner);
                    return;
                default: return;
            }
        }
    }

    public void findByName(Scanner scanner) {
        String name;
        String result = "";
        boolean inputSuccess = false;
        while (!inputSuccess) {
            try {
                name = scanner.next();
                result = labClassUI.find(name).toString();
                inputSuccess = true;
            } catch (LabClassUI.EmptyStringException e) {
                System.out.println(e.getMessage());
                System.out.println("\nEnter student name again: ");
            } catch (LabClassUI.StudentNotFoundException ignored) {
                System.out.println("\nNo such students found");
                return;
            }
        }
        System.out.print("\nStudents found: ");
        System.out.println(result);
    }

    public void findByGrade(Scanner scanner) {
        String result = "";
        boolean inputSuccess = false;
        while (!inputSuccess) {
            try {
                System.out.println("Enter range of grade for search (min and max grades) ");
                System.out.print("Min: ");
                String mixGrade = scanner.nextLine();
                System.out.print("Max: ");
                String maxGrade = scanner.nextLine();
                result = labClassUI.find(mixGrade, maxGrade).toString();
                inputSuccess = true;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("\nEnter grades again: ");
            } catch (LabClassUI.StudentNotFoundException ignored) {
                System.out.println("\nNo such students found");
                return;
            }
        }
        System.out.println("\nStudents found: ");
        System.out.println(result);
    }

    public void sort() {
        labClassUI.sort();
    }
}
