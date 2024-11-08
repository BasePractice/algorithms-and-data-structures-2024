package ru.mirea.practice.s0000001.task1;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Student {
    private String lastName;
    private Calendar birthDate;

    public Student(String lastName, Calendar birthDate) {
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDateAsString(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(birthDate.getTime());
    }

    @Override
    public String toString() {
        return "Студент: " + lastName + ", Дата рождения: " + getBirthDateAsString("dd-MM-yyyy");
    }
}
