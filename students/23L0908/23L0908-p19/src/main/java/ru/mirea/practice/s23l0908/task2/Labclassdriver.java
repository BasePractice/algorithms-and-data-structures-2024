package ru.mirea.practice.s23l0908.task2;

public class Labclassdriver implements Labclassui {

    @Override
    public Student search(String name, Student... students) {
        for (Student student : students) {
            if (name.equals(student.getName())) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student[] sort(Student... students) {
        int size = students.length;
        for (int i = 1; i < size; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getGpa() > key.getGpa()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
        return students;
    }
}
