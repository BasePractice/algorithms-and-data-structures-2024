package ru.mirea.practice.s0000001.task1and4;

public abstract class Tester {
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
    
    public static void main(String[] args) {
        Student[] idnumber = {
            new Student(1, "q"),
            new Student(8, "w"),
            new Student(12, "r"),
            new Student(0, "h"),
            new Student(3, "e")};
        System.out.println(sortById(idnumber)[0]);
        System.out.println(sortById(idnumber)[1]);
        System.out.println(sortById(idnumber)[2]);
        System.out.println(sortById(idnumber)[3]);
        System.out.println(sortById(idnumber)[4]);
    }
}
