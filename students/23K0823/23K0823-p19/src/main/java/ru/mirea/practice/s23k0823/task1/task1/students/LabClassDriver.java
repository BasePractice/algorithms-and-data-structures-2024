package ru.mirea.practice.s23k0823.task1.task1.students;

public abstract class LabClassDriver {
    public static void main(String[] args) {
        LabClass labClass = new LabClass();
        LabClassUI labClassUI = new LabClassUI(labClass);
        labClassUI.createAndShowGui();
    }
}
