package ru.mirea.practice.s0000001.task1;

class UniversityStudent extends Student {
    private String universityName; // University name

    public UniversityStudent(String name, int age, String universityName) {
        super(name, age);
        this.universityName = universityName;
    }

    @Override
    public void showInfo() {
        System.out.println("University Student: " + name + ", Age: " + age + ", University: " + universityName);
    }
}

// Main class to demonstrate the functionality
