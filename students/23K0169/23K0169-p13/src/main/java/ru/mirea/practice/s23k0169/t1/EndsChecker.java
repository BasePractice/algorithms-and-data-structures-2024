package ru.mirea.practice.s23k0169.t1;

public class EndsChecker {

    public boolean doesEndWith(String input, String suffix) {
        if (input == null || suffix == null) {
            return false;
        }
        return input.endsWith(suffix);
    }
}