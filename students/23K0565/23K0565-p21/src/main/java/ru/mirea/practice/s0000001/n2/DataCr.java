package ru.mirea.practice.s0000001.n2;

public class DataCr<T> {
    private T[] data;

    public DataCr(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public T getEl(int idx) {
        if (idx < 0 || idx >= data.length) {
            throw new RuntimeException("Индекс вне диапазона!");
        }
        return data[idx];
    }

    public int getSz() {
        return data.length;
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4};
        String[] strArr = {"a", "b", "c"};

        DataCr<Integer> intCr = new DataCr<>(intArr);
        DataCr<String> strCr = new DataCr<>(strArr);

        System.out.println(intCr.getEl(2)); //вывод 3
        System.out.println(strCr.getEl(1)); //вывод b
        System.out.println("Размер intCr: " + intCr.getSz());
    }
}
