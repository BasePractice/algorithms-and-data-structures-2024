package mirea.lab21.p2;

import java.util.Arrays;

public class Anyarr<T> {
    private T[] array;

    public Anyarr(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setElement(int i, T e) {
        if (i >= 0 && i < array.length) {
            array[i] = e;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
