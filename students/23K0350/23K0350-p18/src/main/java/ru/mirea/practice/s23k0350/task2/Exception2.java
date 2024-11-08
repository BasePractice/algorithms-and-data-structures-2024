package ru.mirea.practice.s23k0350.task2;


class Exception2 {
    public void exceptionDemo() {
        String intString = "qwerty";
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect data format");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
