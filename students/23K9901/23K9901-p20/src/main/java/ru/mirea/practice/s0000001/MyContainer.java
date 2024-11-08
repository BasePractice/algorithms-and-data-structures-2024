package ru.mirea.practice.s0000001;

class MyContainer extends GenericContainer<String, Integer, Double> {

    public MyContainer(String firstValue, Integer secondValue, Double thirdValue) {
        super(firstValue, secondValue, thirdValue);
    }

    @Override
    public void displayValues() {
        System.out.println("Первое значение (String): " + firstValue);
        System.out.println("Второе значение (Integer): " + secondValue);
        System.out.println("Третье значение (Double): " + thirdValue);
    }
}
