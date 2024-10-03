package ru.mirea.practice.s0000002.zadanie2;

public abstract class Employee {
    public static void main(String[] args) {
        Employe[] employees = {new Employe("Иванов Иван Иванович", 50000.00),
                               new Employe("Петров Петр Петрович", 65000.50),
                               new Employe("Сидорова Мария Сергеевна", 48000.75)
        };

        Report.generateReport(employees);
    }
}
