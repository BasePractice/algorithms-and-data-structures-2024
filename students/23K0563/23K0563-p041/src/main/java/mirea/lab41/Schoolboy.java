package mirea.lab41;

public class Schoolboy extends Learner {
    private String school;
    private String form;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Schoolboy(String fullname, int age, String email, String school, String form) {
        super(fullname, age, email);
        this.school = school;
        this.form = form;
    }
}
