package ru.mirea.practice.s23k0135.task3;

public class Animal {
    private String name;
    private int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Вес: " + weight + " кг");
    }
}
