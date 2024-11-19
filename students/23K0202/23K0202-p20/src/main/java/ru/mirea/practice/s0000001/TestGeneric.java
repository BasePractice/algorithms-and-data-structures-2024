package ru.mirea.practice.s0000001;

public final class TestGeneric {
    private TestGeneric() {

    }

    public static void main(String[] args) {
        GenericClass<String, Integer, Double> genericObject = new GenericClass<>("Hello", 123, 45.67);

        System.out.println("Первая переменная: " + genericObject.getFirst());
        System.out.println("Вторая переменная: " + genericObject.getSecond());
        System.out.println("Третья переменная: " + genericObject.getThird());

        genericObject.printClassNames();

    }
}
