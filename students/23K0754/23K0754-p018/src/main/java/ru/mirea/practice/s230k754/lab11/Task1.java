package ru.mirea.practice.s230k754.lab11;



public final class Task1 {
    private Task1() {}

    public static void main(String[] args) {
        // ArithmeticException генерируется при выполнении исключительного арифметического условия.
        // Например, целое число "деление на ноль" генерирует экземпляр этого класса.
        // При конструкции tyr-catch программа не будет завершаться при ошибке, и при определенной ошибке
        // Выдаст к консоль Attempted division by zero
        Exception1.exceptionDemo();
        // Программа выдаст Infinity. Она пытается выполнить вычисление, но значение не имет определенного ответа
        Exception1.exceptionDemoWithFloat();
    }
}
