package mirea.lab18.p2;

public abstract class Prac18p2 {
    public static void main(String[] args) {
        new Exception2().exceptionDemo();
    }
}

/*
 * При вводе qwerty: NumberFormatException, невозможно преобразовать строку qwerty в Int
 * При вводе 0: ArithmeticException, попытка деления на 0
 * При вводе 1.2: NumberFormatException невозможно преобразовать 1.2 в Int
 * При вводе 1: Нет ошибок
 *  */
