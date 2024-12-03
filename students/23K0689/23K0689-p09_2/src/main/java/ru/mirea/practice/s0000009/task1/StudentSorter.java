package ru.mirea.practice.s0000009.task1;

public class StudentSorter {

    public void sortStudentsByIdNumber(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            // Сравниваем idNumber студентов и перемещаем их в нужное положение
            while (j >= 0 && students[j].getIdNumber() > key.getIdNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }
}