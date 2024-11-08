package ru.mirea.practice.s0000001.task3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private GregorianCalendar dateOfBirth;
    private DateFormat df;//f-full, s-sshort, m-medium

    public Student(int id, String name, GregorianCalendar dateOfBirth, String formatOfPrintDate) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        if ("f".equals(formatOfPrintDate)) {
            this.df = new SimpleDateFormat("dd MMM yyy", Locale.US);
        } else if ("s".equals(formatOfPrintDate)) {
            this.df = new SimpleDateFormat("dd", Locale.US);
        } else {
            this.df = new SimpleDateFormat("dd MMM", Locale.US);
        }
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student s) {
        return this.id - s.getId();
    }

    @Override
    public String toString() {
        return "Student:\n"
                + "id = " + id
                + ", name - " + name
                + "\nDate of birth: " + df.format(dateOfBirth.getTime());
    }
}
