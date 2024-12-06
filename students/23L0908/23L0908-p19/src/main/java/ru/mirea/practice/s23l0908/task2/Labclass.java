package ru.mirea.practice.s23l0908.task2;

import java.util.Scanner;

public final class Labclass {

    private Labclass() {
    }

    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Phong", 22, "IKBO-03-23", 4.3);
        students[1] = new Student("The", 22, "IKBO-30-23", 4.3);
        students[2] = new Student("Vinh", 20, "IKBO-04-23", 4);
        students[3] = new Student("Bang", 20, "IKBO-36-23", 4.2);

        Labclassdriver labClassDriver = new Labclassdriver();

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the name to search: ");
            Student temp = labClassDriver.search(in.nextLine(), students);
            System.out.println(temp);

            System.out.println("\nArray before sorting:");
            for (int i = 0; i < 3; i++) {
                System.out.println(students[i]);
            }
            students = labClassDriver.sort(students);
            System.out.println("\nArray after sorting:");
            for (int i = 0; i < 3; i++) {
                System.out.println(students[i]);
            }
        }
    }
}

