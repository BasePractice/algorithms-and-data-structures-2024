package ru.mirea.practice.s0000001.prog3;

public class Student implements Comparable<Student> {
    public String name;
    public Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    // Метод для сравнения студентов по имени
    public int compareTo(Student other) {
        return name.compareTo(other.name);
    }
}
