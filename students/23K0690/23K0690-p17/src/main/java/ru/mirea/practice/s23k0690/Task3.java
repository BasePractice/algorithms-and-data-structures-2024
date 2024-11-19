package ru.mirea.practice.s23k0690;


final class Task3 {
    private Task3() {}

    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        System.out.println("Обновлено:");
        controller.setStudentName("Sergey");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Сигарета");
        student.setRollNo("359");
        return student;
    }
}
