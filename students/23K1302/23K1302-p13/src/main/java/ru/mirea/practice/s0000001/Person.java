package ru.mirea.practice.s0000001;

public class Person {

    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder(lastName);
        if (firstName != null && !firstName.isEmpty()) {
            fullName.append(" ").append(firstName.charAt(0)).append(".");
        }
        if (middleName != null && !middleName.isEmpty()) {
            fullName.append(" ").append(middleName.charAt(0)).append(".");
        }
        return fullName.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Мясников", "Тимофей", "Михайлович");
        Person person2 = new Person("Михаил", "Мясников", null);

        System.out.println("Полное имя первого человека: " + person1.getFullName());
        System.out.println("Полное имя второго человека: " + person2.getFullName());
    }
}
