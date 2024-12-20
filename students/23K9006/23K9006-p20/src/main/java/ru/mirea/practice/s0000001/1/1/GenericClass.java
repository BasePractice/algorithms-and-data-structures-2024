package ru.mirea.practice.s0000001;

abstract class GenericClass<T, V, K> {
    protected T firstValue;
    protected V secondValue;
    protected K thirdValue;

    public GenericClass(T firstValue, V secondValue, K thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public V getSecondValue() {
        return secondValue;
    }

    public K getThirdValue() {
        return thirdValue;
    }

    public void displayClassNames() {
        System.out.println("Тип первого значения: " + firstValue.getClass().getName());
        System.out.println("Тип второго значения: " + secondValue.getClass().getName());
        System.out.println("Тип третьего значения: " + thirdValue.getClass().getName());
    }
}
