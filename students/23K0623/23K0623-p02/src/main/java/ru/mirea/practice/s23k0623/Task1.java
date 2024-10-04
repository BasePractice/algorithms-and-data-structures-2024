package ru.mirea.practice.s23k0623;

public class Task1 {
    private String name;
    private String email;
    private char gender;

    public Task1(String name, String email, char gender) {
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

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name = " + this.name + "\temail = " + this.email + "\tgender = " + this.gender;
    }
}