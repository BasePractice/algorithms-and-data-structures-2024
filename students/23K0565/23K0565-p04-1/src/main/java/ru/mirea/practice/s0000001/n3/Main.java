package ru.mirea.practice.s0000001.n3;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Александр Иванов Денисович", 33);

        System.out.println(person1);
        System.out.println(person2);

        person2.move();
        person2.talk();
    }
}