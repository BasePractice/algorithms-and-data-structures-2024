package ru.mirea.practice.s23k0375.task2;

public abstract class MvcPattDem2 {
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        System.out.println("updated:");
        controller.setEmployeeName("Vsevolod");
        controller.setSalary(125000);
        controller.updateView();
    }

    private static Employee retrieveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setName("Janitor");
        employee.setSalary(115000);
        return employee;
    }
}
