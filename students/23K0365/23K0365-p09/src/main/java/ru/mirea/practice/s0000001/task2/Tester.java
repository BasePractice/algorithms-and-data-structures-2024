package ru.mirea.practice.s0000001.task2;

public abstract class Tester {
    public static Student[] sortbygpa(Student[] arr, int low, int high) {
        if (arr.length == 0 || low >= high) {
            return arr;
        }
        int mid = low + (high - low) / 2;
        int border = arr[mid].getgpa();
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i].getgpa() < border) {
                i++;
            }
            while (arr[j].getgpa() > border) {
                j--;
            }
            if (i <= j) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < i) {
            sortbygpa(arr, low, j);
        }
        if (high > i) {
            sortbygpa(arr, i, high);
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Student[] gpascores = {
            new Student(1, "q"),
            new Student(8, "w"),
            new Student(12, "r"),
            new Student(0, "h"),
            new Student(3, "e")};
        System.out.println(sortbygpa(gpascores, 0, gpascores.length - 1)[0]);
        System.out.println(sortbygpa(gpascores, 0, gpascores.length - 1)[1]);
        System.out.println(sortbygpa(gpascores, 0, gpascores.length - 1)[2]);
        System.out.println(sortbygpa(gpascores, 0, gpascores.length - 1)[3]);
        System.out.println(sortbygpa(gpascores, 0, gpascores.length - 1)[4]);
    }
}
