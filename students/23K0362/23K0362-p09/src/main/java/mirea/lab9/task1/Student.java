package mirea.lab1.task1;

public class Student {
    String name;
    int idNumber;

    Student(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getiDNumber() {
        return idNumber;
    }

    public void setiDNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + ", iDNumber=" + iDNumber + '}';
    }
}
