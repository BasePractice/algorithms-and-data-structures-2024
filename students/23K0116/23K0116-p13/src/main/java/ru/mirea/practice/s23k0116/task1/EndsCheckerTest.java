package ru.mirea.practice.s23k0116.task1;

public abstract class EndsCheckerTest {
    public static void main(String[] args) {

        EndsChecker checker = new EndsChecker();

        String example1 = "I love Java!!!";
        String example2 = "Hello, World!";
        String example3 = "";
        String example4 = null;

        System.out.println(example1 + " " + checker.doesEndWith(example1, "!!!"));
        System.out.println(example2 + " " + checker.doesEndWith(example2, "!!!"));
        System.out.println(example3 + " " + checker.doesEndWith(example3, "!!!"));
        System.out.println(example4 + " " + checker.doesEndWith(example4, "!!!"));
    }
}
