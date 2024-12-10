package ru.mirea.practice.s23k0690;

public class GenericClass2<T, V, K> {
    private T firstParameter;
    private V secondParameter;
    private K thirdParameter;

    public GenericClass2(T firstParameter, V secondParameter, K thirdParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
        this.thirdParameter = thirdParameter;
    }

    public T getFirstParameter() {
        return firstParameter;
    }

    public V getSecondParameter() {
        return secondParameter;
    }

    public K getThirdParameter() {
        return thirdParameter;
    }

    public void printClassNames() {
        System.out.println("Class of firstParameter: " + firstParameter.getClass().getName());
        System.out.println("Class of secondParameter: " + secondParameter.getClass().getName());
        System.out.println("Class of thirdParameter: " + thirdParameter.getClass().getName());
    }

    @Override
    public String toString() {
        return "GenericClass{"
                + "firstParameter=" + firstParameter
                + ", secondParameter=" + secondParameter
                + ", thirdParameter=" + thirdParameter
                + '}';
    }
}

