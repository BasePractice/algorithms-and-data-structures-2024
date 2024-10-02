package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentByGpa {

    private final List<Student> students;

    public SortingStudentByGpa() {
        this.students = new ArrayList<>();
    }

    public void setArray() {
        students.add(new Student("Aleksandr", "Pushkin", "Computer Science", 2, "KVBO-01", 4.8));
        students.add(new Student("Lev", "Tolstoy", "Artificial Intelegence", 1, "KABO-03", 3.1));
        students.add(new Student("Sergey", "Esenin", "Programming", 2, "KBB0-04", 2.9));
        students.add(new Student("Ivan", "Turgenev", "Physics", 4, "KKCO-02", 5.0));
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void quickSort() {
        students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    public void sortByLastName() {
        students.sort(Comparator.comparing(Student::toString));
    }
}
