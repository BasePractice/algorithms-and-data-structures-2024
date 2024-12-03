package ru.mirea.practice.s23k0116.task2;

import java.util.Objects;

public class Person {

    private final String surname;
    private final String name;
    private final String patronymic;

    public Person(String surname, String name, String patronymic) {
        if (surname == null || surname.trim().isEmpty()) {
            throw new IllegalArgumentException("Фамилия не может быть null или пустой.");
        }
        this.surname = surname.trim();
        this.name = name != null && !name.trim().isEmpty() ? name.trim() : null;
        this.patronymic = patronymic != null && !patronymic.trim().isEmpty() ? patronymic.trim() : null;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getFullName() {
        StringBuilder fullNameBuilder = new StringBuilder(surname);

        if (name != null) {
            fullNameBuilder.append(' ').append(getInitial(name)).append('.');
        }

        if (patronymic != null) {
            fullNameBuilder.append(getInitial(patronymic)).append('.');
        }

        return fullNameBuilder.toString();
    }

    private char getInitial(String str) {
        return Character.toUpperCase(str.charAt(0));
    }

    @Override
    public String toString() {
        return getFullName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Person)) {
            return false;
        }

        Person person = (Person) o;

        if (!surname.equals(person.surname)) {
            return false;
        }
        if (!Objects.equals(name, person.name)) {
            return false;
        }
        return Objects.equals(patronymic, person.patronymic);
    }

    @Override
    public int hashCode() {
        int result = surname.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        return result;
    }
}
