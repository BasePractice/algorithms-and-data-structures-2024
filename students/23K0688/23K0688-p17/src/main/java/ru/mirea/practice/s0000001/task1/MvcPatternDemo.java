package ru.mirea.practice.s0000001.task1;

public abstract class MvcPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        System.out.println("updated:");
        controller.setStudentName("Alexander");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("gnom");
        student.setRollNo("121");
        return student;
    }
}
