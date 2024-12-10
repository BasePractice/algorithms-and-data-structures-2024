package ru.mirea.practice.s0000001.task1;

public class GenericClass<T, V, K> {

    // Переменные типа T, V, K
    private T variableT;
    private V variableV;
    private K variableK;

    // Конструктор, принимающий параметры типа T, V, K
    public GenericClass(T variableT, V variableV, K variableK) {
        this.variableT = variableT;
        this.variableV = variableV;
        this.variableK = variableK;
    }

    // Методы для получения значений переменных
    public T getVariableT() {
        return variableT;
    }

    public V getVariableV() {
        return variableV;
    }

    public K getVariableK() {
        return variableK;
    }

    // Метод для вывода имен классов переменных на консоль
    public void printClassNames() {
        System.out.println("Class name for variableT: " + variableT.getClass().getName());
        System.out.println("Class name for variableV: " + variableV.getClass().getName());
        System.out.println("Class name for variableK: " + variableK.getClass().getName());
    }

    public static void main(String[] args) {
        // Пример использования обобщенного класса
        GenericClass<Integer, String, Double> example = new GenericClass<>(42, "Hello", 3.14);

        // Вывод значений переменных
        System.out.println("VariableT: " + example.getVariableT());
        System.out.println("VariableV: " + example.getVariableV());
        System.out.println("VariableK: " + example.getVariableK());

        // Вывод имен классов переменных
        example.printClassNames();
    }
}
