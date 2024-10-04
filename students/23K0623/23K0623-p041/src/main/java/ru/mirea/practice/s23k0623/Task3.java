package ru.mirea.practice.s23k0623;

public class Task3 {
    private String fullName;
    private int age;

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

    public Task3(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Task3() {
        this.fullName = "Name Surname";
        this.age = 0;
    }

    public void talk() {
        System.out.println(this.fullName + " говорит.");
    }

    public void move() {
        System.out.println(this.fullName + " идёт.");
    }
}
