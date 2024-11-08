package ru.mirea.practice.s23k0690;

public abstract class Task4 {
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();
        System.out.println("Обновлено:");
        controller.setEmployeeName("Сергей");
        controller.setSalary(11);
        controller.updateView();
    }

    private static Employee retrieveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setName("Сигарета");
        employee.setSalary(12);
        return employee;
    }
}