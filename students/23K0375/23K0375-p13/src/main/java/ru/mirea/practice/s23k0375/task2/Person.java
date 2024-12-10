package ru.mirea.practice.s23k0375.task2;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    // Конструктор
    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    // Метод для получения Фамилии И.О.
    public String getFullName() {
        StringBuilder fullName = new StringBuilder();

        // Добавляем фамилию
        if (lastName != null && !lastName.isEmpty()) {
            fullName.append(lastName);
        }

        // Добавляем инициал имени, если оно есть
        if (firstName != null && !firstName.isEmpty()) {
            fullName.append(" ").append(firstName.charAt(0)).append(".");
        }

        // Добавляем инициал отчества, если оно есть
        if (middleName != null && !middleName.isEmpty()) {
            fullName.append(" ").append(middleName.charAt(0)).append(".");
        }

        return fullName.toString().trim(); // Убираем лишние пробелы
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        System.out.println(person1.getFullName()); // Иванов И.И.

        Person person2 = new Person("Мельник", "Петр", null);
        System.out.println(person2.getFullName()); // Петров П.

        Person person3 = new Person("Сидоров", null, "Сидорович");
        System.out.println(person3.getFullName()); // Сидоров С.

        Person person4 = new Person("Шушпанов", null, null);
        System.out.println(person4.getFullName()); // Кузнецов
    }
}
