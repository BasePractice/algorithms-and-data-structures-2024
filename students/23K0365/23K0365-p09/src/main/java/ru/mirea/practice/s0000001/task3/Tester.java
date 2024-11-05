package ru.mirea.practice.s0000001.task3;

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

    public static Student[] sortById(Student[] arr) {
        int j;
        for (int i = 0; i < arr.length; i++) {
            Student temp = arr[i];
            for (j = i; j > 0 && temp.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
        return arr;
    }
    
    public static Student[] sortFin(Student[] arr, Student[] arr2) {
        int a = arr.length;
        int b = arr2.length;
        Student[] anotherOne = new Student[a + b];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a && j < b) {
            if (arr[i].compareTo(arr2[j]) < 0) {
                anotherOne[k++] = arr[i++];
            } else {
                anotherOne[k++] = arr2[j++];
            }
        }
        while (j < b) {
            anotherOne[k++] = arr2[j++];
        }
        while (i < a) {
            anotherOne[k++] = arr[i++];
        }
        return anotherOne;
    }
    
    public static void toPrint(Student[] arr) {
        for (Student x : arr) {
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) {
        Student[] gpascores = {
            new Student(1, "q"),
            new Student(8, "w"),
            new Student(12, "r"),
            new Student(12, "h"),
            new Student(3, "e")};

        Student[] arr1 = sortbygpa(gpascores,0, gpascores.length - 1);
        Student[] arr2 = sortById(gpascores);
        toPrint(sortFin(arr1, arr2));
    }
}
