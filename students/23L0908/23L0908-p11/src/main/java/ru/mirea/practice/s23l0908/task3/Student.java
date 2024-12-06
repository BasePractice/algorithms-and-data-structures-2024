package ru.mirea.practice.s23l0908.task3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Student {
    private final String firstname;
    private final String lastname;
    private final String speciality;
    private final int course;
    private final String group;
    private final int gpa;
    private final Calendar dateofbirth;

    public Student(String firstname, String lastname, String speciality, int course, String group, int gpa, int year, int month, int day) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        this.dateofbirth = Calendar.getInstance();
        dateofbirth.set(Calendar.YEAR, year);
        dateofbirth.set(Calendar.MONTH, month);
        dateofbirth.set(Calendar.DAY_OF_MONTH, day);
    }

    public Student(int year, int month, int day) {
        this("Hoang", "Phong", "AI", 2, "KABO-02-23", 5, year, month, day);
    }

    @SuppressWarnings("unused")

    public int getGpa() {
        return gpa;
    }

    public String toString(String typeDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(typeDate);
        return "Student{"
            + "firstName='"
            + firstname
            + '\''
            + ", lastName='"
            + lastname
            + '\''
            + ", speciality='"
            + speciality
            + '\''
            + ", course="
            + course
            + ", group='"
            + group
            + '\''
            + ", gpa="
            + gpa
            + ", DateOfBirth='"
            + dateFormat.format(this.dateofbirth.getTime())
            + '\''
            + '}';
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter\ndate of birth: ");
            final int date = in.nextInt();

            System.out.print("month of birth: ");
            final int month = in.nextInt();

            System.out.print("year of birth: ");
            int year = in.nextInt();

            System.out.println("Enter date of birth format: ");
            in.nextLine();
            String typeDate = in.nextLine();

            Student student = new Student(year, month, date); // Sử dụng ngay các biến
            System.out.println(student.toString(typeDate));
        }
    }

}
