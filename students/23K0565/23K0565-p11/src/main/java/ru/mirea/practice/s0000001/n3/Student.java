package ru.mirea.practice.s0000001.n3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private Date birthDate;

    public Student(String firstName, String lastName, String specialty, int course, String group, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat shortFmt = new SimpleDateFormat("dd.MM.yy");
        SimpleDateFormat mediumFmt = new SimpleDateFormat("dd MMM yyyy");
        SimpleDateFormat longFmt = new SimpleDateFormat("EEEE, dd MMMM yyyy");

        return "Имя: " + firstName + " " + lastName + "\n"
            + "Специальность: " + specialty + "\n"
            + "Курс: " + course + "\n"
            + "Группа: " + group + "\n"
            + "Дата рождения (короткий формат): "
            + shortFmt.format(birthDate) + "\n"
            + "Дата рождения (средний формат): "
            + mediumFmt.format(birthDate) + "\n"
            + "Дата рождения (полный формат): "
            + longFmt.format(birthDate);
    }

    public static void main(String[] args) {
        Date birth = new Date(05, 6, 11);
        Student stud = new Student("Михаил", "Самохин", "Авт", 2, "КАБО-02-23", birth);
        System.out.println(stud);
    }
}
