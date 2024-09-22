package ru.mirea.practice.s23k0164.t3;

public class Animal implements Nameable{
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
