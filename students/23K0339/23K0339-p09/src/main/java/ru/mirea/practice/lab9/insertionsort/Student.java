package ru.mirea.practice.lab9.insertionsort;

public class Student {
    private final String name;
    private final int idnumber;

    public Student(String name, int idnumber) {
        this.name = name;
        this.idnumber = idnumber;
    }

    public int getIdnumber() {
        return idnumber;
    }

    @Override
    public String toString() {
        return "Имя студента = '" + name + "', iDNumber = " + idnumber;
    }
}

