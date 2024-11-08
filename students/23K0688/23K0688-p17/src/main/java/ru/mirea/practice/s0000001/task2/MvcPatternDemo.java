package ru.mirea.practice.s0000001.task2;

public abstract class MvcPatternDemo {
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        System.out.println("updated:");
        controller.setEmployeeName("Alexander");
        controller.setSalary(125000);
        controller.updateView();
    }

    private static Employee retrieveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setName("gnom");
        employee.setSalary(120000);
        return employee;
    }
}
