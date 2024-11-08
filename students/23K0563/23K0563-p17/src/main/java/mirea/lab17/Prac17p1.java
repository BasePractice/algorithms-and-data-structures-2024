package mirea.lab17;

import java.util.Scanner;

public abstract class Prac17p1 {
    public static void main(String[] args) {
        List<Student> students = new List<Student>();
        try (Scanner sc = new Scanner(System.in)) {
            int scount = 5;
            for (int i = 0; i < scount; i++) {
                System.out.println("Студент № " + (i + 1));
                students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
            System.out.println();
            students.pr();
        }

    }
}
