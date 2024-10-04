package ru.mirea.practice.s0000001.task5;


class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int toHumanAge() {
        return age * 7;
    }

    public String toString() {
        return "Dog{name='" + name + "', age=" + age + "}";
    }
}

class DogShelter {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Buddy", 3);
        dogs[1] = new Dog("Max", 5);

        for (Dog dog : dogs) {
            System.out.println(dog + ", Human Age: " + dog.toHumanAge());
        }
    }
}
