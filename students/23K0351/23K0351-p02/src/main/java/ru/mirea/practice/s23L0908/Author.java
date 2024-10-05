package ru.mirea.practice.s23L0908;

public class Author {
    private final String name;
    private String email;
    private final char gender;


    public void setEmail(String email) {
        this.email = email;
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


    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "name - " + name + ", email - " + email + ", gender -" + gender;
    }
}
