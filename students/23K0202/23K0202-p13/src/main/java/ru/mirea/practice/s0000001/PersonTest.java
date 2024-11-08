package ru.mirea.practice.s0000001;


public final class PersonTest {
    private PersonTest() {

    }

    public static void main(String[] args) {
        Person person = new Person("Пушкин", "Александр", "Сергеевич");
        System.out.println(person.getFio());

        Person person2 = new Person("Тургенев", "", "");
        System.out.println(person2.getFio());
    }
}
