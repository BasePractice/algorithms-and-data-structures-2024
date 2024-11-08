package ru.mirea.practice.s0000001.task1;

public class Exception1 {
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


//Программа использует блок try-catch для перехвата и обработки исключения ArithmeticException.
//При попытке деления 2 / 0 возникает исключение, которое перехватывается блоком catch.
//В блоке catch выводится сообщение "Attempted division by zero", и программа продолжает выполнение.
