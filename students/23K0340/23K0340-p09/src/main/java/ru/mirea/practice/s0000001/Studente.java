package ru.mirea.practice.s0000001;

public class Studente implements Comparable<Studente> {
    private String bal;
    private String name;

    public Studente(String id, String name) {
        this.bal = id;
        this.name = name;
    }

    @Override
    public int compareTo(Studente student) {
        return this.bal.compareTo(student.bal);
    }

    public String toString() {
        return "Student1{id:" + bal + ", name:" + name + "}";
    }
}
