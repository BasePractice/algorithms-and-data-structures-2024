package ru.mirea.practice.s23k0087.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Student {
    String name;
    String surname;
    int age;
    Date birthday = new Date();

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setBirthday(String birthdayStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        try {
            birthday = formatter.parse(birthdayStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return "Student [name=" + name + ", surname=" + surname + ", age=" + age + ", birthday=" + formatter.format(birthday) + "]";
    }
}
