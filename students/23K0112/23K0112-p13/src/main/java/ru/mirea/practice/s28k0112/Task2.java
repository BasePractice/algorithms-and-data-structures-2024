package ru.mirea.practice.s28k0112;

public final class Task2 {
    private Task2() {

    }

    public static void main(String[] args) {
        Person person = new Person("Cronov", "Konstantin", "Sergeev");
        System.out.println(person.getFio());

        Person person2 = new Person("Cronov", null, null);
        System.out.println(person2.getFio());
    }
}
