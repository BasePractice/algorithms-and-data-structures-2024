package ru.mirea.practice.s23k0215;

public final class Author {
    private String name;
    private String email;
    private char gender;

    // Конструктор
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Сеттер для email
    public void setEmail(String email) {
        this.email = email;
    }

    // Метод toString
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}

