package ru.mirea.practice.s23K0135;

public abstract class Main {
    public static void main(String[] args) {
        Employer emp1 = new Employer("Иван", "Иванов", 50000);
        Manager mgr1 = new Manager("Анна", "Петрова", 70000, 15000);

        Employer empAsMgr = new Manager("Сергей", "Сидоров", 65000, 12000);

        System.out.println(emp1);
        System.out.println(mgr1);
        System.out.println(empAsMgr);

        Employer[] employees = new Employer[4];
        employees[0] = emp1;
        employees[1] = mgr1;
        employees[2] = empAsMgr;
        employees[3] = new Manager("Мария", "Кузнецова", 80000, 20000);

        System.out.println("\nДоходы всех сотрудников:");
        for (Employer emp : employees) {
            System.out.println(emp.toString());
        }
    }
}
