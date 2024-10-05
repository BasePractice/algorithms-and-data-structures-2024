package ru.mirea.practice.s23L0908.practice41.student;

public class Undergraduateclass {
    public int age;
    public String gender;
    public String name;
    public Double gradeaverage;

    public Undergraduateclass(int age, String gender, String name, double gradeaverage) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.gradeaverage = gradeaverage;
    }

    @Override
    public String toString() {
        return "Undergraduate_class{"
                + "age=" + age
                + ", gender='" + gender + '\''
                + '}';
    }
}
