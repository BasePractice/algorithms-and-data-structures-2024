package ru.mirea.practice.s0000001.task7;

public class UniversityStudent extends Student {
    private String universityName;

    public UniversityStudent(String name, int age, String universityName) {
        super(name, age);
        this.universityName = universityName;
    }

    @Override
    public String getType() {
        return "Студент"; // Возвращаем тип "Студент" для этого класса
    }

    @Override
    public String toString() {
        return super.toString() + ", Университет: " + universityName;
    }
}