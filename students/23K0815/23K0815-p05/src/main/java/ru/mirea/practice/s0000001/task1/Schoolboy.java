package ru.mirea.practice.s0000001.task1;

class Schoolboy extends Student {
    private String schoolName; // School name

    public Schoolboy(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    @Override
    public void showInfo() {
        System.out.println("Schoolboy: " + name + ", Age: " + age + ", School: " + schoolName);
    }
}
