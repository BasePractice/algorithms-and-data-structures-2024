package ru.mirea.practice.s23k0155.task2;

public class Person {
    private String firstName;
    private String name;
    private String secondName;

    public Person(String firstName, String name, String secondName) {
        this.firstName = firstName;
        this.name = name;
        this.secondName = secondName;
    }

    public String getFio() {
        StringBuilder fio = new StringBuilder(firstName);
        if (name != null) {
            fio.append(" ").append(name.charAt(0)).append(".");
        }
        if (secondName != null) {
            fio.append(" ").append(secondName.charAt(0)).append(".");
        }
        return fio.toString();
    }

    public static void main(String[] args) {
        Person person = new Person("Иванов", "Иван", "Иванович");
        System.out.println(person.getFio());

        Person person2 = new Person("Петрова", "Мария", null);
        System.out.println(person2.getFio());

        Person person3 = new Person("Смирнов", null, null);
        System.out.println(person3.getFio());
    }
}
