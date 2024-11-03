package ru.mirea.practice.s23k0120.task2;

import java.util.Collections;
import java.util.stream.Collectors;

public class LabClassUI {
    LabClass labClass;

    LabClassUI(LabClass labClass) {
        this.labClass = labClass;
    }

    LabClassUI() {
        labClass = new LabClass();
    }

    public void addStudent(String name, String averageGradeStr) throws EmptyStringException, NumberFormatException {
        if (name.isEmpty()) {
            throw new EmptyStringException("Student name cannot be empty");
        }
        double averageGrade = Double.parseDouble(averageGradeStr);
        labClass.add(new Student(name, averageGrade));
    }

    public LabClass find(String name) {
        if (name.isEmpty()) {
            throw new EmptyStringException("Student name cannot be empty");
        }
        LabClass labClassFound;
        labClassFound = new LabClass(labClass.stream()
            .filter(student -> student.getName().equals(name))
            .collect(Collectors.toList()));
        if (labClassFound.isEmpty()) {
            throw new StudentNotFoundException("There are no students named " + name);
        }
        return labClassFound;
    }

    public LabClass find(String minGradeStr, String maxGradeStr) {
        double minGrade = Double.parseDouble(minGradeStr);
        double maxGrade = Double.parseDouble(maxGradeStr);
        LabClass labClassFound;
        labClassFound = new LabClass(labClass.stream()
            .filter(student -> student.getAverageGrade() >= minGrade && student.getAverageGrade() <= maxGrade)
            .collect(Collectors.toList()));
        if (labClassFound.isEmpty()) {
            throw new StudentNotFoundException("There are no students with average grade between " + minGrade + " and " + maxGrade);
        }
        return labClassFound;
    }

    public void removeStudent(int index) {
        labClass.remove(index);
    }

    public void removeStudentByName(String name) throws EmptyStringException, StudentNotFoundException {
        if (name.isEmpty()) {
            throw new EmptyStringException("Student name cannot be empty");
        }
        if (!labClass.removeIf(student -> student.getName().equals(name))) {
            throw new StudentNotFoundException("There is no student with name " + name);
        }
    }

    public void sort() {
        Collections.sort(labClass);
    }

    @Override
    public String toString() {
        return labClass.toString();
    }

    public class EmptyStringException extends RuntimeException {
        public EmptyStringException(String message) {
            super(message);
        }

        public EmptyStringException(String message, Throwable err) {
            super(message, err);
        }
    }

    public class StudentNotFoundException extends RuntimeException {
        public StudentNotFoundException(String message) {
            super(message);
        }

        public StudentNotFoundException(String message, Throwable err) {
            super(message, err);
        }
    }
}
