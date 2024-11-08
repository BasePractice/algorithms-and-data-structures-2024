package ru.mirea.practice.s0000001.prog2;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;//отчество

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return lastName;
    }

    public void setSurName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return middleName;
    }

    public void setPatronymic(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder result = new StringBuilder();

        if (lastName != null) {
            result.append(lastName);
        }

        if (firstName != null) {
            result.append(" ");
            result.append(firstName.charAt(0)).append(".");
        }

        if (middleName != null) {
            result.append(middleName.charAt(0)).append(".");
        }

        return result.toString().trim(); // Возвращаем результат без лишних пробелов
    }
}
