package ru.mirea.practice.s23k0120.task1.author;

public class Author {
    private final String name;
    private final char gender;
    private String email;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "---------Автор---------\n"
                + "Имя: " + name + '\n'
                + "Почта: " + email + '\n'
                + "Пол: " + gender + "\n-----------------------";
    }
}
