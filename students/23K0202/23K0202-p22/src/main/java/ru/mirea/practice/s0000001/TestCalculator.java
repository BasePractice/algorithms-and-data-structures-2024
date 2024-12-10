package ru.mirea.practice.s0000001;

public final class TestCalculator {
    private TestCalculator() {

    }

    public static void main(String[] args) throws Exception {
        RpnCalculator calculator = new RpnCalculator(10);
        System.out.println("1 2 + = " + calculator.calculate("1 2 +"));
        System.out.println("2 3 * 4 5 * + = " + calculator.calculate("2 3 * 4 5 * +"));
        System.out.println("2 3 4 5 6 * + - / = " + calculator.calculate("2 3 4 5 6 * + - /"));

        try {
            System.out.println("1 0 / = " + calculator.calculate("1 0 /"));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
