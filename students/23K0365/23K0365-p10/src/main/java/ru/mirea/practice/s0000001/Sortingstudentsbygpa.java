package ru.mirea.practice.s0000001;

import java.util.Arrays;
import java.util.Comparator;

public class Sortingstudentsbygpa implements Comparator<Student> {
    private Student[] idnumber;

    public void setArray(int len, Student a, Student b, Student c) {
        this.idnumber = new Student[len];
        idnumber[0] = a;
        idnumber[2] = c;
        idnumber[1] = b;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getgpa() - o2.getgpa();
    }

    public static Sortingstudentsbygpa quicksort(Sortingstudentsbygpa arr, int low, int high) {
        if (arr.idnumber.length == 0 || low >= high) {
            return arr;
        }
        int mid = low + (high - low) / 2;
        Student border = arr.idnumber[mid];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr.compare(border,arr.idnumber[i]) > 0) {
                i++;
            }
            while (arr.compare(border,arr.idnumber[i]) < 0) {
                j--;
            }
            if (i <= j) {
                Student temp = arr.idnumber[i];
                arr.idnumber[i] = arr.idnumber[j];
                arr.idnumber[j] = temp;
                i++;
                j--;
            }
        }
        if (low < i) {
            quicksort(arr, low, j);
        }
        if (high > i) {
            quicksort(arr, i, high);
        }
        return arr;
    }

    public static Student[] mergeSort(Student[] arr) {
        Student[] buf1 = Arrays.copyOf(arr, arr.length);
        Student[] buf2 = new Student[arr.length];
        return mergeSortInner(buf1, buf2, 0, arr.length);
    }

    public static Student[] mergeSortInner(Student[] buf1, Student[] buf2, int start, int end) {
        if (start >= end - 1) {
            return buf1;
        }
        int mid = start + (end - start) / 2;
        Student[] sort1 = mergeSortInner(buf1, buf2, start, mid);
        Student[] sort2 = mergeSortInner(buf1, buf2, mid, end);
        int i1 = start;
        int i2 = mid;
        int i3 = start;
        Student[] result;
        if (sort1 == buf1) {
            result = buf1;
        } else {
            result = buf2;
        }
        while (i1 < mid && i2 < end) {
            if (sort1[i1].getgpa() < sort2[i2].getgpa()) {
                result[i3++] = sort1[i1++];
            } else {
                result[i3++] = sort2[i2++];
            }
        }
        while (i1 < mid) {
            result[i3++] = sort1[i1++];
        }
        while (i2 < end) {
            result[i3++] = sort2[i2++];
        }
        return result;
    }

    public void outArray() {
        for (Student x : this.idnumber) {
            System.out.println(x);
        }
    }

    public static Student[] sortFin(Sortingstudentsbygpa arr, Student[] arr2) {
        int a = arr.idnumber.length;
        int b = arr2.length;
        Student[] anotherOne = new Student[a + b];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a && j < b) {
            if (arr.compare(arr.idnumber[i],arr2[j]) < 0) {
                anotherOne[k++] = arr.idnumber[i++];
            } else {
                anotherOne[k++] = arr2[j++];
            }
        }
        while (j < b) {
            anotherOne[k++] = arr2[j++];
        }
        while (i < a) {
            anotherOne[k++] = arr.idnumber[i++];
        }
        return anotherOne;
    }

    public static void main(String[] args) {
        Sortingstudentsbygpa a = new Sortingstudentsbygpa();
        Sortingstudentsbygpa b = new Sortingstudentsbygpa();
        Student[] ar = {
            new Student("q", "w", "e", 2, "t", 12),
            new Student("q", "w", "e", 1, "t", 34),
            new Student("q", "w", "e", 4, "t", 6),
        };
        a.setArray(3, ar[0], ar[1], ar[2]);
        b.setArray(3, ar[0], ar[1], ar[2]);
        a = a.quicksort(a, 0, a.idnumber.length - 1);
        b.idnumber = b.mergeSort(b.idnumber);
        a.outArray();
    }
}
