package ru.mirea.practice.s23k0143;

public class Students {
    private final int idNumber;
    private final String name;

    public Students(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{ " + "iDNumber = " + idNumber + ", name = " + name + " }";
    }
}
