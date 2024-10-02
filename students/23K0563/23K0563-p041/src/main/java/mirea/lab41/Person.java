package mirea.lab41;

/* Создать класс Person, который содержит: a) поля fullName, age. б)
методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой то Person говорит".
в) Добавьте два конструктора - Person() и Person(fullName,
age). Создайте два объекта этого класса. Один объект инициализируется
конструктором Person(), другой - Person(fullName, age) */


public class Person {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        this.fullName = "Name Surname";
        this.age = 0;
    }

    public void talk() {
        System.out.println(this.fullName + " говорит.");
    }

    public void move() {
        System.out.println(this.fullName + " идёт.");
    }
}
