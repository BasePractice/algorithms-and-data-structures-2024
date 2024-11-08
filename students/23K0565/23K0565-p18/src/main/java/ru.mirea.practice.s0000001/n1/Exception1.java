package ru.mirea.practice.s0000001.n1;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0); // Деление на ноль!!!
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить запрещено:(");
        }
    }
}
//Добавим исключение с указанием ошибки
