package ru.mirea.practice.s23k0755.task1;

class Author {
    public String name;
    public  String email;
    public  char gender;

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

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Ваш автор:\n"
                + "Зовут "
                + getName()
                + " с Email "
                + getEmail()
                + " с полом "
                + getGender();
    }
}






