package ru.mirea.practice.s23k0350;

import java.util.Arrays;
import java.util.Random;

public abstract class Test {
    public static void main(String[] args) {
        Student st = new Student(new Comparable[100]);
        Random r = new Random();
        for (int t = 0; t < st.idnumber.length; t++) {
            st.idnumber[t] = r.nextInt(100);
        }
        System.out.println("Not sorted: " + Arrays.toString(st.idnumber));
        st.insertionSort(st.idnumber);
        System.out.println("Sorted: " + Arrays.toString(st.idnumber));


    }
}
