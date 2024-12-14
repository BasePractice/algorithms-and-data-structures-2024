package ru.mirea.practice.s23k0755;

public class Exception {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 example = new Exception1();
        example.exceptionDemo();
    }
}
//когда программа пытается выполнить деление 2 на 0, вместо того чтобы завершиться с ошибкой, управление передаётся
//в блок catch, где обрабатываете исключение. В результате программа не завершится аварийно, а выведет на экран сообщение

