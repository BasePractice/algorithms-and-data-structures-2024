package ru.mirea.practice.s0000001;

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
        System.out.println("Вы сидите на викторианском стуле, которому " + age + " лет.");
    }
}
