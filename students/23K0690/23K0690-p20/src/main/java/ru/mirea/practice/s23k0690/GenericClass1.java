package ru.mirea.practice.s23k0690;

public class GenericClass1<T, V, K> {
    private T firstParameter;
    private V secondParameter;
    private K thirdParameter;

    public GenericClass1(T firstParameter, V secondParameter, K thirdParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
        this.thirdParameter = thirdParameter;
    }

    public T getFirstParameter() {
        return firstParameter;
    }

    public void setFirstParameter(T firstParameter) {
        this.firstParameter = firstParameter;
    }

    public V getSecondParameter() {
        return secondParameter;
    }

    public void setSecondParameter(V secondParameter) {
        this.secondParameter = secondParameter;
    }

    public K getThirdParameter() {
        return thirdParameter;
    }

    public void setThirdParameter(K thirdParameter) {
        this.thirdParameter = thirdParameter;
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
