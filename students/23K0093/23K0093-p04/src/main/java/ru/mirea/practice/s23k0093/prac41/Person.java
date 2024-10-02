package ru.mirea.practice.s23k0093.prac41;

class Person {
    private String fullName;
    private int age;

    // Конструктор без параметров
    public Person() {
        this.fullName = "Неизвестно";
        this.age = 0;
    }

    // Конструктор с параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод для передвижения
    public void move() {
        System.out.println(fullName + " двигается.");
    }

    // Метод для разговора
    public void talk() {
        System.out.println(fullName + " говорит.");
    }

    // Геттеры и сеттеры
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{fullName='" + fullName + "', age=" + age + '}';
    }
}