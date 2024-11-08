package ru.mirea.practice.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private final String name;
    private final Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getBirthDateFormatted(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthDate);
    }

    @Override
    public String toString() {
        return "Student{имя='" + name + "', дата Рождения=" + getBirthDateFormatted("dd.MM.yyyy") + "}";
    }

    public static void main(String[] args) {
        Student student = new Student("Иван Иванов", new Date());
        System.out.println(student);
    }
}

