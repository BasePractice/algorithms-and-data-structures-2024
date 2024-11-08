package ru.mirea.practice.lab19.student;

public interface StudentSearchable {
    Student searchStudentByFullName(String firstName, String lastName) throws StudentNotFoundException;
}

