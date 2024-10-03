package ru.mirea.practice.s0000002;

import java.util.Arrays;
import java.util.Scanner;

/*********************************************************************************
 * Разработайте и реализуйте класс Dog (Собака), поля класса описывают           *
 * кличку и возраст собаки. Необходимо выполнить следующие действия:             *
 * определить конструктор собаки, чтобы принять и инициализировать данные        *
 * экземпляра., включить стандартные методы (аксессоры) для получения и          *
 * установки для имени и возраста, включить метод для перевода возраста собаки в *
 * “человеческий” возраст (возраст семь раз собаки), включите метод ToString,    *
 * который возвращает описание экземпляра собаки в виде строки. Создание класса  *
 * тестера под названием ПитомникСобак, реализует массив собак и основной        *
 * метод этого класса позволяет добавить в него несколько объектов собаки.       *
 ********************************************************************************/

public abstract class Task5 {
    public static void main(String[] args) {
        DogShelter shelter = new DogShelter(5);
        shelter.addNDogs(5);

        System.out.println(Arrays.toString(shelter.dogs));
    }

    static class Dog {
        private String name;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int toHumanAge() {
            return this.age * 7;
        }

        @Override
        public String toString() {
            return "Doggy { name='" + name + "'; age=" + age + " }";
        }
    }

    static class DogShelter {
        Dog[] dogs;
        int am = 0;

        public DogShelter(int maxCap) {
            dogs = new Dog[maxCap];
        }

        public void addNDogs(int n) {
            if (n < 1 && n >= this.dogs.length) {
                throw new RuntimeException("Максимально можно добавить " + (this.dogs.length - this.am) + "собак/собаку/собаки.");
            }
            for (int i = this.am; i < dogs.length; ++i) {

                try (Scanner sc = new Scanner(System.in)) {
                    String name = sc.nextLine();
                    int age = sc.nextInt();
                    sc.close();

                    Dog doggy = new Dog(name, age);

                    this.dogs[i] = doggy;
                    System.out.println(new Dog(name, age) + " теперь часть огромной семьи.");
                    System.out.println("По человеческим меркам " + doggy.getName() + " сейчас " + doggy.toHumanAge() + " годиков.");
                }
            }
        }
    }
}
