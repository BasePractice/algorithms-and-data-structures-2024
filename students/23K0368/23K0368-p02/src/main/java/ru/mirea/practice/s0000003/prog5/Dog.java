package ru.mirea.practice.s0000003.prog5;

public class Dog {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Integer ageTo(int age) {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", age= '" + age + '\'' + ", age to people = '" + ageTo(age) + '\'' + '}';
    }
}
