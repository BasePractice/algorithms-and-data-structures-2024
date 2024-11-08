package ru.mirea.practice.s0000001.students;

import java.util.Comparator;

public class SortingStudentsByGpa {
    private Student[] students;

    public void setArray(Student[] students) {
        this.students = students;
    }

    public void quicksort(Comparator<Student> comparator) {
        quicksort(students, 0, students.length - 1, comparator);
    }

    private void quicksort(Student[] array, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(array, low, high, comparator);
            quicksort(array, low, pi - 1, comparator);
            quicksort(array, pi + 1, high, comparator);
        }
    }

    private int partition(Student[] array, int low, int high, Comparator<Student> comparator) {
        Student pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(array[j], pivot) > 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(Student[] array, int i, int j) {
        Student temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public Student findStudentByName(String name) throws StudentNotFoundException, EmptyStringException {
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyStringException("Имя студента не может быть пустым.");
        }

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }

        throw new StudentNotFoundException("Студент с именем '" + name + "' не найден.");
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}