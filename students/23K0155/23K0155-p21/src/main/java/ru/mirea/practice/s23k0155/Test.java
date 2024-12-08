package ru.mirea.practice.s23k0155;

public abstract class Test {
    public static void main(String[] args) {
        ArrayClass tester = new ArrayClass(4);
        tester.addElement(1);
        tester.addElement(123.8766);
        tester.addElement(1234567890123456789L);
        tester.addElement("Number");
        System.out.println("Элепмент под индексем 3: " + tester.getElement(3));
        System.out.println("все эллементы:");
        tester.printArray();
    }
}
