package ru.mirea.practice.s23k0143;

public abstract class GenericTest {
    public static void main(String[] args) {
        MyGenericClass<Integer, Person, String> myGenericObject =
            new MyGenericClass<>(19, new Person("Никита", 26), "Нитка");

        System.out.println("Первый: " + myGenericObject.getFirst());
        System.out.println("Второй: " + myGenericObject.getSecond().getName());
        System.out.println("Третий: " + myGenericObject.getThird());

        myGenericObject.printClassNames();
    }
}
