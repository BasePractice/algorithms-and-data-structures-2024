package ru.mirea.practice.s0000001.prog2;

public abstract class Main {
    public static void main(String[] args) {
        Person pers = new Person("Милёхин", null, null);
        System.out.println(pers.getFullName());

        Person pers2 = new Person("Колесников", "Иван", null);
        System.out.println(pers2.getFullName());

        Person pers3 = new Person("Гребёнкин", "Олег", "Романович");
        System.out.println(pers3.getFullName());
    }
}
