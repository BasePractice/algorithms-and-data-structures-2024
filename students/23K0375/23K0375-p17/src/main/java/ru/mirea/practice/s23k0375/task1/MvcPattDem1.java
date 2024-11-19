package ru.mirea.practice.s23k0375.task1;

public abstract class MvcPattDem1 {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        System.out.println("updated:");
        controller.setStudentName("Vsevolod");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Future worker");
        student.setRollNo("227");
        return student;
    }
}
