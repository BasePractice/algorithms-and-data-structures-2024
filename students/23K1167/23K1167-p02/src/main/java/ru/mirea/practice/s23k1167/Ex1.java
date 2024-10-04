package ru.mirea.practice.s23k1167;

public class Ex1 {
    private final String name;
    private String email;
    private final char gender;

    public Ex1(String name, String email, char gender) {
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
        return "Имя: " + name + " Email: " + email + " Гендер: " + gender;
    }
}
