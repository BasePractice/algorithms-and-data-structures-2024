package ru.mirea.practice.s23k0690;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setSalary(int salary) {
        model.setSalary(salary);
    }

    public int getSalary() {
        return model.getSalary();
    }

    public void updateView() {
        view.printEmployeeDetails(model.getSalary(), model.getName());
    }
}
