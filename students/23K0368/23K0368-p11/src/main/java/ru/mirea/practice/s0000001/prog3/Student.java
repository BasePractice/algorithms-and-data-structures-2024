package ru.mirea.practice.s0000001.prog3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Student {
    public String name;
    public int age;
    public String group;
    public LocalDate birthday;

    public Student(String name, int age, String group, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        // Определение формата даты по введенной строке
        FormatStyle formatStyle = determineFormatStyle(birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(formatStyle);
        return "Student{"
                + "name='" + name + '\''
                + ", birthDate=" + birthday.format(formatter)
                + '}';
    }

    private FormatStyle determineFormatStyle(String formattedDate) {
        if (formattedDate.contains(" ") && formattedDate.contains(",")) { // Полный формат
            return FormatStyle.FULL;
        } else if (formattedDate.contains(".") || formattedDate.contains("-")) { // Короткий формат
            return FormatStyle.SHORT;
        } else {
            return FormatStyle.MEDIUM; // По умолчанию средний формат
        }
    }
}
