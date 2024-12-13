package ru.mirea.practice.s0000001.task3;

public abstract class Main {
    public static void main(String[] args) {
        try {
            if (args[0] != null) {
                try {
                    Operationable test = new Binary.Substracrt(new Binary.Multiply(new Binary.Const(2),
                            new Binary.Variables("x")), new Binary.Const(3));
                    System.out.println(test.evaluate(Double.parseDouble(args[0])) == 7.);//из примера, ответ должен быть 7
                } catch (NumberFormatException e) {
                    System.out.println("bad input");
                }
            }
        } catch (ArrayIndexOutOfBoundsException o) {
            System.out.println("bad input");
        }

        Operationable test = new Binary.Substracrt(new Binary.Multiply(new Binary.Const(2),
            new Binary.Variables("x")), new Binary.Const(3));
        System.out.println(test.evaluate(3) == 7.);//из примера, ответ должен быть 7

        Operationable scndTest = new Binary.Add(new Binary.Substracrt(new Binary.Multiply(new Binary.Variables("x"),
            new Binary.Variables("x")), new Binary.Multiply(new Binary.Const(2), new Binary.Variables("x"))),
            new Binary.Const(1)); // x^2 − 2x + 1, x = 33 => answ.:4
        System.out.print(4. == scndTest.evaluate(3));
    }
}
