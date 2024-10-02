package ru.mirea.practice.s0000001.task2;

public abstract class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Иван", "Петров", 5000);
        employees[1] = new Manager("Елена", "Смирнова", 6000, 1000);
        employees[2] = new Employee("Андрей", "Кузнецов", 4000);

        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + "  " + employee.getLastName() + " доход: " + employee.getIncome());
        }
    }
}