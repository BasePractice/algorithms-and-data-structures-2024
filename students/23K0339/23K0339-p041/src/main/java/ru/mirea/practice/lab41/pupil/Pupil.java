package ru.mirea.practice.lab41.pupil;

abstract class Pupil {
    protected String name;

    public Pupil(String name) {
        this.name = name;
    }

    public String getType() {
        return "Учащийся";
    }

    public void displayInfo() {
        System.out.println(name + " - " + getType());
    }
}


