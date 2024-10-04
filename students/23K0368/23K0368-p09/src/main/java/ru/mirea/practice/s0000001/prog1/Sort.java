package ru.mirea.practice.s0000001.prog1;

public abstract class Sort {
    public static void sort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student cmt = students[i];
            int ind = i - 1;
            while (ind >= 0 && students[ind].idNumber > cmt.idNumber) {
                students[ind + 1] = students[ind];
                ind = ind - 1;
            }
            students[ind + 1] = cmt;
        }
    }
}
