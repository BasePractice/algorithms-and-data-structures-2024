package ru.mirea.practice.s0000001;

public class Person {
    public String name;
    public String surname;
    public String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getFio() {
        StringBuilder result = new StringBuilder().append(surname);

        if (name != null && !name.isEmpty()) {
            result.append(" ").append(name.charAt(0)).append("."); // Добавляем первую букву имени
        }

        if (patronymic != null && !patronymic.isEmpty()) {
            result.append(patronymic.charAt(0)).append(".");
        }

        return result.toString();
    }


}
