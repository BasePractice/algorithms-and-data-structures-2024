package ru.mirea.practice.s0000001.task2and3;

import java.util.Iterator;
import java.util.function.Consumer;

public class MyListIterating<T> implements Iterator<T> {
    private MyTypeList<T> one;
    private int indeks;

    public MyListIterating(MyTypeList<T> one) {
        this.one = one;
        this.indeks = 0;
    }

    @Override
    public T next() {
        return one.get(indeks++);
    }

    @Override
    public boolean hasNext() {
        return indeks < one.size();
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Iterator.super.forEachRemaining(action);
    }

    public static void main(String[] args) {
        MyTypeList<Integer> glhf = new MyTypeList<>();
        for (int i = 0; i < 19; i++) {
            glhf.add(i);
            System.out.print(i + "  ");
        }
        System.out.println();
        MyListIterating<Integer> gg = new MyListIterating<>(glhf);
        while (gg.hasNext()) {
            System.out.println(gg.next());
        }
    }
}
