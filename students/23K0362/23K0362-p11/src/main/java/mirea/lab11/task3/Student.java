package ru.mirea.lab11.task3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String surname;
    private Date birthDate;

    public Student(String firstName, String surname, Date birthDate) {
        this.firstName = firstName;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        System.out.println("Введите формат вывода даты (short, medium, full) > ");
        DateFormat df;
        try (Scanner sc = new Scanner(System.in)) {
            String inputFormat = sc.nextLine();
            if (inputFormat.equals("short")) {
                df = new SimpleDateFormat("d.M.yy");
            } else if (inputFormat.equals("full")) {
                df = new SimpleDateFormat("d MMMM yyyy");
            } else {
                df = new SimpleDateFormat("d MMM yyyy");
            }
            return "Student{ firstName: " + firstName  + ", surname: " + surname + ", birthDate: "
                    + df.format(birthDate) + '}';
        }
    }
}