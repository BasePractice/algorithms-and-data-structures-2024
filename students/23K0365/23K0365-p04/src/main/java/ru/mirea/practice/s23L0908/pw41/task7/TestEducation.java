package ru.mirea.practice.s23L0908.pw41.task7;

public abstract class TestEducation {
    public static void main(String[] args) {
        Studier[] arr = {
            new Schooler(9, "q"),
            new Schooler(12, "a"),
            new Student(19, "Q"),
            new Student(22, "Q")
        };
        for (Studier x: arr) {
            if (x instanceof Schooler) {
                System.out.println(x.getName() + " is schooler");
            }
        }
        for (Studier x: arr) {
            if (x instanceof Student) {
                System.out.println(x.getName() + " is student");
            }
        }
    }
}
