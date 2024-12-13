package ru.mirea.practice.s23k0368.prog2;

public class VictorianChair implements Chair {
    private final int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sit() {
        System.out.println("Ура, стул имеется и мы на него сели.");
    }
}
