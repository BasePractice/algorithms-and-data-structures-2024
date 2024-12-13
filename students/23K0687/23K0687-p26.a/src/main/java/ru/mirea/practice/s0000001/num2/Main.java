package ru.mirea.practice.s0000001.num2;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }

    public static void main(String[] args) {
        MyList<Integer> l = new MyArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        MyIterator<Integer> it = l.iter();

        while (it.hasNext()) {
            System.out.println("Элемент: " + it.next());
        }
    }
}
