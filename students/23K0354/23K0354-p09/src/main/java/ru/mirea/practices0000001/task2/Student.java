package ru.mirea.practices0000001.task2;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{"
                +
                "id=" + id
                +
                ", name='" + name + '\''
                +
                '}';
    }
}

