package ru.mirea.practice.s230k754.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date birthday;

    public Student(String name, Date date) {
        this.name = name;
        this.birthday = date;
    }

    @Override
    public String toString() {
        return new SimpleDateFormat("EEEE MMMM, d, yyyy").format(birthday) + "\n"
            + new SimpleDateFormat("dd MMM yyy GG").format(birthday);
    }

    public String getName() {
        return name;
    }
}
