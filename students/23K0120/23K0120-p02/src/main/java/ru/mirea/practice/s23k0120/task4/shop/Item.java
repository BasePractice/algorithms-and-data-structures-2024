package ru.mirea.practice.s23k0120.task4.shop;

public class Item {
    private String name;
    private float cost;

    public Item(String name, float cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public float getCost() {
        return this.cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + ", cost=" + cost + '}';
    }
}
