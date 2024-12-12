package mirea.lab20.task4;

/*
4. Написать обобщенный класс MinMax, который содержит
методы для нахождения минимального и максимального элемента
массива. Массив является переменной класса. Массив должен
передаваться в класс через конструктор. Написать класс Калькулятор
(необобщенный), который содержит обобщенные статические методы -
sum, multiply, divide, subtraction. Параметры этих методов - два числа
разного типа, над которыми должна быть произведена операция.
 */

public class FindMaxMin<T extends Comparable<T>> {
    private final T[] arrayValues;

    public FindMaxMin(T[] arrayValues) {
        this.arrayValues = arrayValues;
    }

    public T findMin() {
        try {
            if (arrayValues == null || arrayValues.length == 0) {
                throw new IllegalArgumentException("Must values in input array.");
            }
            T minValue = arrayValues[0];
            for (int i = 1; i < arrayValues.length; i++) {
                if (arrayValues[i].compareTo(minValue) < 0) {
                    minValue = arrayValues[i];
                }
            }
            return minValue;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public T findMax() {
        try {
            if (arrayValues == null || arrayValues.length == 0) {
                throw new IllegalArgumentException("Must values in input array.");
            }
            T maxValue = arrayValues[0];
            for (int i = 1; i < arrayValues.length; i++) {
                if (arrayValues[i].compareTo(maxValue) > 0) {
                    maxValue = arrayValues[i];
                }
            }
            return maxValue;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
