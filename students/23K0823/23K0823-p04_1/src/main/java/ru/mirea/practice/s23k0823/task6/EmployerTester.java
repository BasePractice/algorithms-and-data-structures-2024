package ru.mirea.practice.s23k0823.task6;

public abstract class EmployerTester {
    public static void main(String[] args) {
        Employer[] employers = new Employer[3];

        employers[0] = new Employer("Иван", "Петров", 5000);
        employers[1] = new Manager("Елена", "Смирнова", 6000, 1000);
        employers[2] = new Employer("Андрей", "Кузнецов", 4000);

        for (Employer employer : employers) {
            System.out.println(employer.getFirstName() + " " + employer.getLastName() + " доход: " + employer.getIncome());
        }
    }
}