package ru.mirea.practice.s00000018.task2;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder(surname);
        if (name != null && !name.isEmpty()) {
            fullName.append(" ").append(name.substring(0, 1)).append(".");
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            fullName.append(" ").append(patronymic.substring(0, 1)).append(".");
        }
        return fullName.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        System.out.println(person1.getFullName());

        Person person2 = new Person("Петров", null, "Петрович");
        System.out.println(person2.getFullName());

        Person person3 = new Person("Сидоров", "Сидор", null);
        System.out.println(person3.getFullName());

        Person person4 = new Person("Кузнецов", null, null);
        System.out.println(person4.getFullName());
    }
}
