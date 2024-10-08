package ru.mirea.practice.s23K0135.task1;

// Superclass Student
class Student {
    protected String name; // Student's name
    protected int age;     // Student's age

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        // This method will be overridden in the subclasses
    }
}


// Subclass University Student
