package ru.mirea.practice.s23k0755.task3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student {
    private final String firstName;
    private final String secondName;
    private final String idNumber;
    private final Date dateOfBirth;
    private String specialty;
    private String group;
    private double gpa;

    public Student(String firstName, String secondName, Date dateOfBirth, String idNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
    }

    public Student(String firstName, String secondName, Date dateOfBirth, String idNumber, String specialty, String group) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
        this.specialty = specialty;
        this.group = group;
    }

    @Override
    public String toString() {
        String s1 = String.format("\nStudent{%s %s %s лет", firstName, secondName, getAge());
        return String.format("%-30s %s Направление: %-8s %s Средний балл: %.2f}", s1, idNumber, specialty, group, gpa);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        long timeDiff = System.currentTimeMillis() - dateOfBirth.getTime();
        Calendar years = Calendar.getInstance();
        years.setTimeInMillis(timeDiff);
        return years.get(Calendar.YEAR) - 1970;
    }

    public String printDateOfBirth(DateFormat format) {
        SimpleDateFormat sdf;
        switch (format) {
            case SHORT: {
                sdf = new SimpleDateFormat("dd.MM.YY");
                break;
            }
            case LONG: {
                sdf = new SimpleDateFormat("E dd.MM.yyyy");
                break;
            }
            default: {
                sdf = new SimpleDateFormat("dd.MM.yyyy");
                break;
            }
        }
        return sdf.format(this.dateOfBirth);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
