package ru.mirea.practice.s0000001.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Sortingstudentsbygpa {

    public Student[] setArray(Student[] sar) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0;i < sar.length;i++) {
                if (sar[i] == null) {
                    Student st = new Student(0,0);
                    System.out.println("input GPA:");
                    st.setGpa(sc.nextInt());
                    System.out.println("input ID:");
                    st.setId(sc.nextInt());
                    sar[i] = st;
                    System.out.println(st + " added successfully");
                } else if (i == sar.length - 1) {
                    System.out.println("no available space");
                }
            }
        }
        return sar;
    }

    public void quickgpa(Student[] sg, int on, int tw) {
        if (on < tw) {
            int i1 = secgpa(sg, on, tw);
            quickgpa(sg, on, i1 - 1);
            quickgpa(sg, i1 + 1, tw);
        }
    }

    private int secgpa(Student[] sg, int on, int tw) {
        int i = on - 1;
        for (int j = on; j < tw; j++) {
            if (sg[j].compareTo(sg[tw],1) > 0) {
                i++;
                Student temp = sg[i];
                sg[i] = sg[j];
                sg[j] = temp;
            }
        }
        Student temp = sg[i + 1];
        sg[i + 1] = sg[tw];
        sg[tw] = temp;
        return i + 1;
    }

    public void merg(Student[] s, int strt, int end) {
        if (end <= strt) {
            return;
        }
        int mid = strt + (end - strt) / 2;
        merg(s, strt, mid);
        merg(s, mid + 1, end);
        Student[] bc = Arrays.copyOf(s, s.length);

        if (end + 1 - strt >= 0) {
            System.arraycopy(s, strt, bc, strt, end + 1 - strt);
        }
        int i2 = strt;
        int i3 = mid + 1;
        for (int i1 = strt; i1 <= end; i1++) {

            if (i2 > mid) {
                s[i1] = bc[i3];
                i3++;
            } else if (i3 > end) {
                s[i1] = bc[i2];
                i2++;
            } else if (bc[i3].getId() < bc[i2].getId()) {
                s[i1] = bc[i3];
                i3++;
            } else {
                s[i1] = bc[i2];
                i2++;
            }
        }
    }

    public void outArray(Student[] st) {
        for (int i = 0;i < st.length;i++) {
            if (st[i] != null) {
                System.out.println("N" + (i + 1) + "-" + st[i]);
            }
        }
    }
}
