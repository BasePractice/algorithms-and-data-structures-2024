package ru.mirea.lab20.task1_3;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private String typeOfAnimal;
    private int age;

    public Animal(String name, String typeOfAnimal, int age) {
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", typeOfAnimal='"
                + typeOfAnimal + '\'' + ", age=" + age + '}';
    }
}
