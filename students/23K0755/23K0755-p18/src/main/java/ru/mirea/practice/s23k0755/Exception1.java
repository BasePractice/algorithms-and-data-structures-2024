package ru.mirea.practice.s23k0755;

public class Exception1 {
    public void exceptionDemo() {
        System.out.println(2.0 / 0.0);
    }

    public static void main(String[] args) {
        Exception1 example = new Exception1();
        example.exceptionDemo();
    }
}

//программа пытается выполнить деление целого числа 2 на 0. В Java это приводит к исключению ArithmeticException, так как деление на ноль невозможно.
//при выполнении данного кода произойдёт не исключение, а вывод значения Infinity. В Java деление дробного числа (типа double) на ноль не вызывает
//ArithmeticException, а возвращает специальное значение Infinity, так как это математически допустимо

