package ru.mirea.practice.s23k0823.task1.task1.task1;

public abstract class TestVenom {
    public static void main(String[] args) {
        GenericClass<String, Integer, Double> object = new GenericClass<>("String", 10, 20.5);
        System.out.println(object.getFieldT() + " " + object.getFieldV() + " " + object.getFieldK());
        GenericClass<String, String, String> newObject = new GenericClass<>("Я", "Мы", "Веном");
        System.out.println(newObject.getFieldT() + " " + newObject.getFieldV() + " " + newObject.getFieldK());
        newObject.setFieldT("Эди");
        newObject.setFieldV("Я");
        newObject.setFieldK("Venom");
        System.out.println(newObject.getFieldT() + " " + newObject.getFieldV() + " " + newObject.getFieldK());
    }
}
