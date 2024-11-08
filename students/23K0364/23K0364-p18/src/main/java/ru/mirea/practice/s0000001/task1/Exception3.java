package ru.mirea.practice.s0000001.task1;

public class Exception3 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception3 example = new Exception3();
        example.exceptionDemo();
    }
}

//Без обработки исключений программа завершится с ошибкой при делении на ноль.
//При использовании блока try-catch программа перехватывает исключение и продолжает выполнение,
// выводя сообщение об ошибке вместо аварийного завершения.
