package ru.mirea.practice.s23k0155;

class InsertionSort {
    private int numberOfStudents;

    public InsertionSort(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public static void sort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getiDNumber() > key.getiDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
