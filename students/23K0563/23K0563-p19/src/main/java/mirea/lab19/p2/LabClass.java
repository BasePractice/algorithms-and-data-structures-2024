package mirea.lab19.p2;

import java.util.ArrayList;
import java.util.List;

public class LabClass {
    private List<Student> students;

    LabClass() {
        this.students = new ArrayList<>();
    }

    public void stadd(String name, int gpa) {
        students.add(new Student(name, gpa));
    }

    public String stfind(String name) {
        if (name.trim().isEmpty()) {
            throw new EmptyStringException("Строка ФИО пустая!");
        }
        for (Student i : students) {
            if (i.getName().equalsIgnoreCase(name)) {
                return i.toString();
            }
        }
        throw new StudentNotFoundException("Студент " + name + " не найден.");
    }

    public void stlist() {
        System.out.println("Текущий список студентов:");
        for (Student i : students) {
            System.out.println(i.toString());
        }
    }

    public List<Student> stsortgpa() {
        students.sort(new StdComparator());
        return students;
    }
}
