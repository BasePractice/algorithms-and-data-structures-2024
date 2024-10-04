package ru.mirea.practice.s0000001;

public abstract class Tester2 {
    public static void sort(Studente[] students, int s, int e) {
        if (s == e) {
            return;
        }
        if (s >= e) {
            return;
        }
        Studente piv = students[s + (e - s) / 2];
        int i = s;
        int j = e;
        while (i <= j) {
            while (students[i].compareTo(piv) <= -1) {
                i++;
            }
            while (students[j].compareTo(piv) >= 1) {
                j--;
            }
            if (i <= j) {
                Studente temp = students[i];
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
        Studente[] students = new Studente[5];
        students[0] = new Studente("55","name");
        students[1] = new Studente("25","name");
        students[2] = new Studente("15","name");
        students[3] = new Studente("75","name");
        students[4] = new Studente("45","name");
        for (int i = 0;i < 5;i++) {
            System.out.print(students[i].toString() + " ");
        }
        sort(students,0,4);
        System.out.println("");
        for (int i = 0;i < 5;i++) {
            System.out.print(students[i].toString() + " ");
        }
    }
}
