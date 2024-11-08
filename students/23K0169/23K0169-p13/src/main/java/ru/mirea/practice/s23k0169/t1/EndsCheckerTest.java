package ru.mirea.practice.s23k0169.t1;

public final class EndsCheckerTest {

    private EndsCheckerTest() {

    }

    public static void main(String[] args) {

        EndsChecker checker = new EndsChecker();

        String example1 = "I love Java!!!";
        String example2 = "Hello, World!";
        String example3 = "No exclamation marks";
        String example4 = "Multiple!!! Exclamation!!!";
        String example5 = "";
        String example6 = null;

        System.out.println("Example 1: \"" + example1 + "\" ends with \"!!!\"? " + checker.doesEndWith(example1, "!!!"));
        System.out.println("Example 2: \"" + example2 + "\" ends with \"!!!\"? " + checker.doesEndWith(example2, "!!!"));
        System.out.println("Example 3: \"" + example3 + "\" ends with \"!!!\"? " + checker.doesEndWith(example3, "!!!"));
        System.out.println("Example 4: \"" + example4 + "\" ends with \"!!!\"? " + checker.doesEndWith(example4, "!!!"));
        System.out.println("Example 5: \"" + example5 + "\" ends with \"!!!\"? " + checker.doesEndWith(example5, "!!!"));
        System.out.println("Example 6: null ends with \"!!!\"? " + checker.doesEndWith(example6, "!!!")); // false
    }
}
