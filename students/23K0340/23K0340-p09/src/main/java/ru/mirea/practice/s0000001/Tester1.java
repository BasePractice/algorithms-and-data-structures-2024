package ru.mirea.practice.s0000001;

public abstract class Tester1 {
    public static void main(String[] args) {
        Student1[] students = new Student1[5];
        students[3] = new Student1("1001","name");
        students[1] = new Student1("1010","name");
        students[2] = new Student1("1100","name");
        students[0] = new Student1("1111","name");
        students[4] = new Student1("0011","name");
        for (int i = 0;i < 5;i++) {
            System.out.print(students[i].toString() + " ");
        }
        System.out.println(" ");
        for (int i = 0;i < 4; i++) {
            Student1 student = null;
            int st = 0;
            for (int j = i; j < 4; j++) {
                if (students[j].compareTo(students[j + 1]) == 1) {
                    student = students[j + 1];
                    st = j + 1;
                    break;
                }
            }
            for (int j = st; j > 0; j--) {
                if (student.compareTo(students[j - 1]) == -1) {
                    students[j] = students[j - 1];
                    if (j - 1 == 0) {
                        students[j - 1] = student;
                    }
                } else {
                    students[j] = student;
                }
            }
        }
        for (int i = 0;i < 5;i++) {
            System.out.print(students[i].toString() + " ");
        }
    }
}
