package ru.mirea.practice.s23k0505.task5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHumanAge() {
        this.age = 7 * age;
    }

    @Override
    public String toString() {
        return "Dog\n"
                + "name=" + name + '\n'
                + "age=" + age + '\n';
    }
}
