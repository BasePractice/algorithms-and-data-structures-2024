package ru.mirea.practice.s23k0375.task12;

public class GenericClass<T, V, K> {
    private T variableT;
    private V variableV;
    private K variableK;

    // Конструктор, принимающий на вход параметры типа (T, V, K)
    public GenericClass(T variableT, V variableV, K variableK) {
        this.variableT = variableT;
        this.variableV = variableV;
        this.variableK = variableK;
    }

    // Методы возвращающие значения трех переменных
    public T getVariableT() {
        return variableT;
    }

    public V getVariableV() {
        return variableV;
    }

    public K getVariableK() {
        return variableK;
    }

    // Метод, выводящий на консоль имена классов для трех переменных класса
    public void printClassNames() {
        System.out.println("Class of variableT: " + variableT.getClass().getName());
        System.out.println("Class of variableV: " + variableV.getClass().getName());
        System.out.println("Class of variableK: " + variableK.getClass().getName());
    }

    public static void main(String[] args) {
        // Пример использования обобщенного класса
        GenericClass<Integer, String, Double> genericObject = new GenericClass<>(10, "Hello", 3.14);

        // Вывод значений переменных
        System.out.println("VariableT: " + genericObject.getVariableT());
        System.out.println("VariableV: " + genericObject.getVariableV());
        System.out.println("VariableK: " + genericObject.getVariableK());

        // Вывод имен классов переменных
        genericObject.printClassNames();
    }
}
