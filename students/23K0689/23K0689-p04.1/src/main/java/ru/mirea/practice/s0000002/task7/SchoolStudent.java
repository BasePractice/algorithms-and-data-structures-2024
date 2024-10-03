package ru.mirea.practice.s0000002.task7;

public class SchoolStudent extends Student {
    private String schoolName;

    public SchoolStudent(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    @Override
    public String getType() {
        return "Школьник"; // Возвращаем тип "Школьник" для этого класса
    }

    @Override
    public String toString() {
        return super.toString() + ", Школа: " + schoolName;
    }
}