package ru.mirea.practice.s23f0011.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student2 {
    private final String name;
    private final Date birthDate;

    // Конструктор
    public Student2(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Геттер для даты рождения
    public Date getBirthDate() {
        return birthDate;
    }

    // Метод для получения строкового представления даты рождения в заданном формате
    public String getFormattedBirthDate(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthDate);
    }

    // Переопределенный метод toString()
    @Override
    public String toString() {
        return "Student{"
            + "name='" + name + '\''
            + ", birthDate=" + getFormattedBirthDate("yyyy-MM-dd") // Стандартный формат
            + '}';
    }
}
