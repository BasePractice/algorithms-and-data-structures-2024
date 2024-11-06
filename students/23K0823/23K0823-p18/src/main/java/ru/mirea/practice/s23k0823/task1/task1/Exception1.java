package ru.mirea.practice.s23k0823.task1.task1;

import java.util.Scanner;

public class Exception1 {

    public void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
        // Изначально мы взяли дробовик и пошли стрелять себе в ногу,
        // как и было сказанно в методичке тк делить на 0 нельзя и мы
        // резонно получили ошибку потом по заданию сказанно поменять
        // тип данных на double если мы возьмём код 18.3, то в таком
        // случае меня телепортирует в первый семестр первого курса
        // к товарищу Карпову)) Тк тут нас настигает великий и ужастный
        // IEEE 754 который используется для расчёта с плавующей точкой
        // и по этому, когда мы пытемся вот так поделиться выйдет
        // "положительная"" бесконечность, а не ошибка и соответсвенно нам
        // нечего отработать в блоке catch. А если говорить про целочисленные,
        // то мы пытемся выстрелить в ногу и не упасть с крыши в ногу, то мы
        // стреляем в блоке try, а вот с крыши нам не даёт упасть блок catch,
        // который такой ты куда собрасля ты конечно гений, но суицид не выход))
    }

    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo();
        exception1.exceptionDemo2();
        exception1.exceptionDemo3();
    }

    public void exceptionDemo2() {
        try (Scanner myScanner = new Scanner(System.in);) {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (ArithmeticException e) {
                System.out.println("Нельзя делить на ноль.");
            } catch (NumberFormatException e) {
                System.out.println("Недопустимый формат ввода. Тебе же сказали число (ЦЕЛОЕ)!!! Какая строка... или опять человеческий IEEE754))");
            }
            // В данном случае если мы введём что-то кроме целого числа и нуля,
            // то мы словим обработку NumberFormatException, которая смотрит на
            // соответствие "формату". Ну и плюс обрабатываем попытку математичскии
            // и инженерно стрельнуть себе в ногу (деление на 0)
        }
    }

    public void exceptionDemo3() {
        try (Scanner myScanner = new Scanner(System.in);) {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (ArithmeticException e) {
                System.out.println("Нельзя делить на ноль.");
            } catch (NumberFormatException e) {
                System.out.println("Недопустимый формат ввода. Тебе же сказали число (ЦЕЛОЕ)!!! Какая строка... или опять человеческий IEEE754))");
            } finally {
                System.out.println("Вот и сказке конец!");
            }
            // finally это просто так сказать блок
            // подведния итога ку4да мы приходим в любом случае
        }
    }
}



