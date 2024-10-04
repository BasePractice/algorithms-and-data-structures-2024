package mirea.lab9;

public class Student implements Comparable {
    private int gpa;
    private int id;

    public Student(int gpa, int id) {
        this.gpa = gpa;
        this.id = id;
    }

    public int getgpa() {
        return gpa;
    }

    public void setgpa(int gpa) {
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        return this.id - ((Student) o).id;
    }

    @Override
    public String toString() {
        return "Student{" + "GPA=" + gpa + ", id=" + id + '}';
    }
}
