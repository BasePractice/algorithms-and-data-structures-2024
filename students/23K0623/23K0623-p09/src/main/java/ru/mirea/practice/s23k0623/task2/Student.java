package ru.mirea.practice.s23k0623.task2;

public class Student {
    private final String name;
    private final String idNumber;
    private final int age;
    private float mathGrade;
    private float physicsGrade;
    private float compSciGrade;
    private float philosophyGrade;

    public Student(String name, String idNumber, int age) {
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
    }

    public Student(String name, String idNumber, int age, float mathGrade, float physicsGrade, float compSciGrade, float philosophyGrade) {
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
        this.mathGrade = mathGrade;
        this.physicsGrade = physicsGrade;
        this.compSciGrade = compSciGrade;
        this.philosophyGrade = philosophyGrade;
    }

    public float getPhilosophyGrade() {
        return philosophyGrade;
    }

    public void setPhilosophyGrade(float philosophyGrade) {
        this.philosophyGrade = philosophyGrade;
    }

    public float getCompSciGrade() {
        return compSciGrade;
    }

    public void setCompSciGrade(float compSciGrade) {
        this.compSciGrade = compSciGrade;
    }

    public float getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(float physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public float getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(float mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setGrades(float mathGrade, float physicsGrade, float compSciGrade, float philosophyGrade) {
        this.mathGrade = mathGrade;
        this.physicsGrade = physicsGrade;
        this.compSciGrade = compSciGrade;
        this.philosophyGrade = philosophyGrade;
    }

    public int getAge() {
        return age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return String.format("{Student: ID: %s Math: %.2f Physics: %.2f Computer Science: %.2f Philosophy: %.2f}",
                idNumber, getMathGrade(), getPhysicsGrade(), getCompSciGrade(), getPhilosophyGrade());
    }

    public String getName() {
        return name;
    }
}