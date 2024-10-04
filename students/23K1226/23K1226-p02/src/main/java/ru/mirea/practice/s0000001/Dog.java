package ru.mirea.practice.s0000001;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHumanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Собака: " + name + ", возраст: " + age;
    }
}
