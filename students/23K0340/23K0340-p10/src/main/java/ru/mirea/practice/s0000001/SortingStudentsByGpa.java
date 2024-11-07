package ru.mirea.practice.s0000001;

import java.util.Scanner;

public class SortingStudentsByGpa {
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

    public void qsort(Student[] students, int s, int e) {
        SortingStudentsByGpa test = new SortingStudentsByGpa();
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
            qsort(students, s, j);
        }
        if (e > i) {
            qsort(students, i, e);
        }
    }

    void merge(Student[] students, int l, int m, int r) {
        SortingStudentsByGpa test = new SortingStudentsByGpa();
        int lle = m - l + 1;
        int rle = r - m;
        Student[] lmas = new Student[lle];
        Student[] rmas = new Student[rle];
        for (int i = 0; i < lle; i++) {
            lmas[i] = students[l + i];
        }
        for (int j = 0; j < rle; j++) {
            rmas[j] = students[m + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < lle && j < rle) {
            if (test.compare(lmas[i],rmas[j]) == -1) {
                students[k] = lmas[i];
                i++;
            } else {
                students[k] = rmas[j];
                j++;
            }
            k++;
        }
        while (i < lle) {
            students[k] = lmas[i];
            i++;
            k++;
        }
        while (j < rle) {
            students[k] = rmas[j];
            j++;
            k++;
        }
    }

    public void msort(Student[] students, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            msort(students, l, m);
            msort(students, m + 1, r);
            merge(students, l, m, r);
        }
    }
}
