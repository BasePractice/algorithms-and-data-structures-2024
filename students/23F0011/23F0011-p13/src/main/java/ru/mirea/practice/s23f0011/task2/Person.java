package ru.mirea.practice.s23f0011.task2;

public class Person {
    private String lastName; // Фамилия
    private String firstName; // Имя
    private String middleName; // Отчество

    // Конструктор
    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    // Метод для получения фамилии с инициалами
    public String getFullName() {
        StringBuilder fullName = new StringBuilder(lastName); // Используем StringBuilder для оптимизации

        // Добавляем инициал имени, если оно не пустое
        if (firstName != null && !firstName.isEmpty()) {
            fullName.append(" ").append(firstName.charAt(0)).append(".");
        }

        // Добавляем инициал отчества, если оно не пустое
        if (middleName != null && !middleName.isEmpty()) {
            fullName.append(" ").append(middleName.charAt(0)).append(".");
        }

        return fullName.toString(); // Возвращаем строку
    }
}
