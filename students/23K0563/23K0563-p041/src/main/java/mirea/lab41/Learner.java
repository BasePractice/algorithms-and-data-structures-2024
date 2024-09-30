package mirea.lab41;

public class Learner {
    private String fullname;
    private int age;
    private String email;

    public Learner(String fullname, int age, String email) {
        this.fullname = fullname;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Учащийся{"
                + "fullname='"
                + fullname
                +
                '\''
                + ", age='"
                + age
                + '\''
                + ", email='"
                + email
                + '\''
                + '}';
    }
}
