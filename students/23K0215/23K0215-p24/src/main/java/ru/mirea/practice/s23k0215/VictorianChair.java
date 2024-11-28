package ru.mirea.practice.s23k0215;

class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sit() {
        System.out.println("Сидим на викторианском стуле");
    }
}
