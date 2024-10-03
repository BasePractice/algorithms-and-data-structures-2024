package mirea.lab6.p3;

public abstract class Prac6p3 {
    public static void main(String[] args) {
        Nameable a = new Car("SUV", "Ford Explorer", "White");
        Nameable b = new Animal("Rex", "Dog", 3, 'M');
        Nameable c = new Planet("Earth", 6378, 14);
        System.out.println(a.toString() + '\n' + b.toString() + '\n' + c.toString());
        System.out.println(a.getName() + '\n' + b.getName() + '\n' + c.getName());
    }
}
