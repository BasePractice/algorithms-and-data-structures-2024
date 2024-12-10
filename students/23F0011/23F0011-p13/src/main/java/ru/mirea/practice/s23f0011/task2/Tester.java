package ru.mirea.practice.s23f0011.task2;

public abstract class Tester {
    public static void main(String[] args) {
        // Примеры использования класса Person
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Петров", "Петр", null);
        Person person3 = new Person("Сидоров", null, "Сидорович");
        Person person4 = new Person("Кузнецов", "", "Алексеевич");
        Person person5 = new Person("Смирнов", null, null);

        // Выводим полные имена
        System.out.println(person1.getFullName()); // Иванов И.И.
        System.out.println(person2.getFullName()); // Петров П.
        System.out.println(person3.getFullName()); // Сидоров С.
        System.out.println(person4.getFullName()); // Кузнецов А.
        System.out.println(person5.getFullName()); // Смирнов
    }
}
