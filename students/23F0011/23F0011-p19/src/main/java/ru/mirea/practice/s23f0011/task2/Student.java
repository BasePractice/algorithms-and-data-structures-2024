package ru.mirea.practice.s23f0011.task2;

class Student {
    private String fullName;
    private double averageScore;

    public Student(String fullName, double averageScore) throws EmptyStringException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new EmptyStringException("ФИО не может быть пустым");
        }
        this.fullName = fullName;
        this.averageScore = averageScore;
    }

    public String getFullName() {
        return fullName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Студент: " + fullName + ", Средний балл: " + averageScore;
    }
}
