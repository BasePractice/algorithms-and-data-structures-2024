package ru.mirea.practice.s0000001;

import java.util.Scanner;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int id;
    Student next;

    public Student() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter name: ");
            this.name = sc.nextLine();
            System.out.println("Enter surname: ");
            this.surname = sc.nextLine();
            System.out.println("Enter age: ");
            this.age = sc.nextInt();
            System.out.println("Enter id: ");
            this.id = sc.nextInt();
            this.next = null;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() {
        return this.id;
    }

    public void print() {
        System.out.println("Student{name:" + name + ", surname:" + surname + ", age:" + age + "}");
    }
}
