package mirea.lab24.p2;

public class VictorianChair implements Chair {
    public int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public void sit() {
        System.out.println("Викторианский стул, которому " + age + " лет");
    }

    public int getAge() {
        return age;
    }
}
