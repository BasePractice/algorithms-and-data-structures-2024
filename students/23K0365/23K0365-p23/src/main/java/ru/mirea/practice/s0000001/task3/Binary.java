package ru.mirea.practice.s0000001.task3;

public abstract class Binary implements Operationable {
    protected Operationable first;
    protected Operationable second;

    public Binary(Operationable first, Operationable second) {
        this.first = first;
        this.second = second;
    }

    public static class Const implements Operationable {
        private double constanta;

        public Const(double constanta) {
            this.constanta = constanta;
        }

        @Override
        public double evaluate(double x) {
            return constanta;
        }
    }

    public static class Variables implements Operationable {
        private String var;

        public Variables(String var) {
            this.var = var;
        }

        @Override
        public double evaluate(double x) {
            return x;
        }
    }

    public static class Add extends Binary {
        public Add(Operationable first, Operationable second) {
            super(first, second);
        }

        @Override
        public double evaluate(double x) {
            return first.evaluate(x) + second.evaluate(x);
        }
    }

    public static class Substracrt extends Binary {
        public Substracrt(Operationable first, Operationable second) {
            super(first, second);
        }

        @Override
        public double evaluate(double x) {
            return first.evaluate(x) - second.evaluate(x);
        }
    }

    public static class Multiply extends Binary {
        public Multiply(Operationable first, Operationable second) {
            super(first, second);
        }

        @Override
        public double evaluate(double x) {
            return first.evaluate(x) * second.evaluate(x);
        }
    }

    public class Divide extends Binary {
        public Divide(Operationable first, Operationable second) {
            super(first, second);
        }

        @Override
        public double evaluate(double x) {
            return (second.evaluate(x) == .0) ? null : first.evaluate(x) - second.evaluate(x);
        }
    }
}
