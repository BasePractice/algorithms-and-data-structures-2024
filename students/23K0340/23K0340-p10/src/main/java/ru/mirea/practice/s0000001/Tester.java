package ru.mirea.practice.s0000001;

import java.util.Scanner;

public class Tester {
    public static void setIdnum(Student[] idnum, int n) {
        try (Scanner sc = new Scanner(System.in)) {
            idnum = new Student[n];
            for (int i = 0;i < n;i++) {
                idnum[i] = null;
                System.out.println("Enter name:");
                idnum[i].setName(sc.nextLine());
                System.out.println("Enter surname:");
                idnum[i].setSurname(sc.nextLine());
                System.out.println("Enter speciality");
                idnum[i].setSpeciality(sc.nextLine());
                System.out.println("Enter av");
                idnum[i].setAv(sc.nextInt());
            }
        }
    }

    public void outArray(Student[] mas, int n) {
        for (int i = 0;i < n; i++) {
            System.out.print(mas[i].getName() + " " + mas[i].getAv() + " " + mas[i].getSpeciality() + " " + mas[i].getSurname());
        }
    }

    public int compare(Student a, Student b) {
        if (a.getAv() > b.getAv()) {
            return 1;
        } else if (a.getAv() < b.getAv()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void sort(Student[] students, int s, int e) {
        Tester test = new Tester();
        if (s == e) {
            return;
        }
        if (s >= e) {
            return;
        }
        Student piv = students[s + (e - s) / 2];
        int i = s;
        int j = e;
        while (i <= j) {
            while (test.compare(students[i],piv) <= -1) {
                i++;
            }
            while (test.compare(students[j],piv) >= 1) {
                j--;
            }
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }
        if (s < j) {
            sort(students, s, j);
        }
        if (e > i) {
            sort(students, i, e);
        }
    }

    public static void main(String[] args) {
        Tester test = new Tester();
        Student[] mas = new Student[0];
        test.setIdnum(mas,3);
        for (int i = 0;i < 3;i++) {
            System.out.print(mas[i].toString() + " ");
        }
        sort(mas,0,3);
        for (int i = 0;i < 5;i++) {
            System.out.print(mas[i].toString() + " ");
        }
    }
}
