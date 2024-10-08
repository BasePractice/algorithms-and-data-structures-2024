package ru.mirea.practice.s23K0135.task1;

class Person {
    private String fullName;

    public Person() {
        this("Unknown");
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public void move() {
        System.out.println(fullName + " движется.");
    }

    public void talk() {
        System.out.println(fullName + " говорит.");
    }
}
