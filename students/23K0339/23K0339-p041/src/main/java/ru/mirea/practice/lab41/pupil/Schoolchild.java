package ru.mirea.practice.lab41.pupil;

class Schoolchild extends Pupil {
    public Schoolchild(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Школьник";
    }
}


