package ru.mirea.practice.s0000001.task2;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Person(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            fullName.append(" ").append(firstName.charAt(0)).append(".");
        }

        if (patronymic != null && !patronymic.isEmpty()) {
            fullName.append(" ").append(patronymic.charAt(0)).append(".");
        }

        return fullName.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Петров", "Петр", null);
        Person person3 = new Person("Сидоров", null, "Сидорович");
        Person person4 = new Person("Кузнецов", null, null);

        System.out.println(person1.getFullName()); // Иванов И.И.
        System.out.println(person2.getFullName()); // Петров П.
        System.out.println(person3.getFullName()); // Сидоров С.
        System.out.println(person4.getFullName()); // Кузнецов
    }
}
