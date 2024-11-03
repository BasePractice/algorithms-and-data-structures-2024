package ru.mirea.practice.s23k0120.task2;

import java.util.List;
import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {
        Student[] students = {new Student("Владимир Маяковский", 3),
            new Student("Лев Толстой", 4.5),
            new Student("Александр Пушкин", 3.5)};

        LabClassUI labClassUI = new LabClassUI(new LabClass(List.of(students)));

        LabClassDriver labClass = new LabClassDriver(labClassUI);

        try (Scanner scanner = new Scanner(System.in)) {
            labClass.run(scanner);
        }
    }
}
