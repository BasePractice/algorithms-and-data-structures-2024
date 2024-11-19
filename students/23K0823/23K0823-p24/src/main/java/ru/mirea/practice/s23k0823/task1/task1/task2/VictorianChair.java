package ru.mirea.practice.s23k0823.task1.task1.task2;

public class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public void sit() {
        System.out.println("Сижу на викторианском стуле, возраст: " + age);
    }

    public int getAge() {
        return age;
    }
}
