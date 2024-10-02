package ru.mirea.practice.s23k0087.task1;

public class Author {
    private final String name;
    private String email;
    private final char gender;

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
        if (email.matches("^[\\w-.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$")) {
            this.email = email;
        } else {
            System.out.println("Неверный адрес электронной почты");
        }
    }

    public char getGender() {
        return gender;
    }


    public String toString() {
        return "Author[name = " + name + ", email = " + email + ", gender = " + gender + "]";
    }

}
