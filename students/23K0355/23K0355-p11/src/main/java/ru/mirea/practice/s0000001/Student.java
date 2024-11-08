package ru.mirea.practice.s0000001;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {

    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', birthDate=" + formatDate(birthDate, "short") + "}";
    }

    public String formatDate(Date date, String formatType) {
        SimpleDateFormat sdf = null;

        switch (formatType.toLowerCase(Locale.ROOT)) {
            case "short":
                sdf = new SimpleDateFormat("dd.MM.yy");
                break;
            case "medium":
                sdf = new SimpleDateFormat("dd MMM yyyy");
                break;
            case "long":
                sdf = new SimpleDateFormat("d MMMM yyyy");
                break;
            default:
                throw new IllegalArgumentException("Invalid format type: " + formatType);
        }

        return sdf.format(date);
    }

    public static void main(String[] args) {
        Date birthDate = new Date(95, 7, 22);
        Student student = new Student("Иван Иванов", birthDate);

        System.out.println(student);

        System.out.println("Короткий формат: " + student.formatDate(birthDate, "short"));
        System.out.println("Средний формат: " + student.formatDate(birthDate, "medium"));
        System.out.println("Длинный формат: " + student.formatDate(birthDate, "long"));
    }
}
