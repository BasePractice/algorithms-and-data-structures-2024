package ru.mirea.practice.lab41.person;

class Person {
    private final String fullName;
    private final int age;

    public Person() {
        this.fullName = "Неизвестный";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Иван Говорунков", 30);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }

    public int getAge() {
        return age;
    }

    public void move() {
        System.out.println(this.fullName + " передвигается");
    }

    public void talk() {
        System.out.println(this.fullName + " говорит");
    }
}

