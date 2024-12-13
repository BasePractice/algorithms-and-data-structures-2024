package ru.mirea.practice.s0000001.num2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private String n;
    private Date b;

    public Main(String n, Date b) {
        this.n = n;
        this.b = b;
    }

    public String getBirthDateFormatted(String f) {
        SimpleDateFormat sdf = new SimpleDateFormat(f);
        return sdf.format(b);
    }

    @Override
    public String toString() {
        return "Студент{name='" + n + "', дата рождения=" + getBirthDateFormatted("dd.MM.yyyy") + "}";
    }

    public static void main(String[] args) {
        Date b = new Date(95, 4, 14);  // Дата рождения
        Main s = new Main("Джон Доу", b);
        System.out.println(s);
        System.out.println(s.getBirthDateFormatted("dd MMM yyyy"));
        System.out.println(s.getBirthDateFormatted("yyyy-MM-dd"));
    }
}
