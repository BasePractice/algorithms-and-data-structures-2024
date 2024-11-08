package ru.mirea.practices0000001.task2;

public class PersonFormatter {

    public String getFullNameInitials(Person person) {
        StringBuilder result = new StringBuilder();

        if (person.getLastName() != null && !person.getLastName().isEmpty()) {
            result.append(person.getLastName());
        }

        if (person.getFirstName() != null && !person.getFirstName().isEmpty()) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(person.getFirstName().charAt(0)).append(".");
        }

        if (person.getMiddleName() != null && !person.getMiddleName().isEmpty()) {
            result.append(person.getMiddleName().charAt(0)).append(".");
        }

        return result.toString();
    }
}
