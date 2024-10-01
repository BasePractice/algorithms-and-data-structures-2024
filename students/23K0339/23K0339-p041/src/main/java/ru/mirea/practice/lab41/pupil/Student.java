package ru.mirea.practice.lab41.pupil;

class Student extends Pupil {
    public Student(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Студент";
    }
}


