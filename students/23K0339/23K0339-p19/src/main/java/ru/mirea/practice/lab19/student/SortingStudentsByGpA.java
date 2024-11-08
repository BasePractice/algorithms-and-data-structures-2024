package ru.mirea.practice.lab19.student;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGpA implements StudentSearchable {
    private Student[] students;

    public void setArray(Student[] students) {
        this.students = students;
    }

    public void quicksort() {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGpa(), s1.getGpa());
            }
        });
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void mergeAndSort(Student[] array1, Student[] array2) {
        int totalLength = array1.length + array2.length;
        students = new Student[totalLength];

        System.arraycopy(array1, 0, students, 0, array1.length);
        System.arraycopy(array2, 0, students, array1.length, array2.length);

        quicksort();
    }

    public void sortByLastName() {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getLastName().compareTo(s2.getLastName());
            }
        });
    }


    @Override
    public Student searchStudentByFullName(String firstName, String lastName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с именем " + firstName + " " + lastName + " не найден.");
    }
}
