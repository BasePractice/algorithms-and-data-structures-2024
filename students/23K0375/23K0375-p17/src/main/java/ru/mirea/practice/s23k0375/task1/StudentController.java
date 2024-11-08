package ru.mirea.practice.s23k0375.task1;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model,StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        view.printstudentdetails(model.getRollNo(), model.getName());
    }

}
