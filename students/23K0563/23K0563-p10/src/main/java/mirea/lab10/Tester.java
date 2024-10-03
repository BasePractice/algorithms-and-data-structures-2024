package mirea.lab10;

import java.util.Arrays;

public abstract class Tester {
    public static void main(String[] args) {
        Student[] iDNumber = new Student[]{
            new Student("Egor", "Sidorov", "Automatics",
                    2, "KABO-01-23", 25, 267),
            new Student("Ivan", "Ivanov", "Computer Science",
                    3, "EEEE-00-00", 11, 127),
            new Student("Sergey", "Krepishev", "Math",
                    1, "aaaaa-11-11", 7, 230)
        };
        SortingStudentsBygpa.quickSort(iDNumber, iDNumber.length - 1, 0);
        System.out.println(Arrays.toString(iDNumber));
    }
}
