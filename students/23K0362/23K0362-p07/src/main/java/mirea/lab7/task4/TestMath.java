package mirea.lab9.task4;

abstract class TestMath {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        System.out.println("5**2: " + mathFunc.pow(5, 2));
        System.out.println("|-1+i|: " + mathFunc.absComplex("-1+i"));
        System.out.println("Длина окружности с R=10: " + mathFunc.circumference(10));
    }
}