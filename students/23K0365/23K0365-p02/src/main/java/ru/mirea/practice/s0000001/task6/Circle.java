package ru.mirea.practice.s0000001.task6;

public class Circle {
    private double x;
    private double y;
    private double R;
    private double PI=3.14159;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.R = r;
    }

    public void setR(double r) {this.R = r;}

    public double getSqure(){return PI*(this.R*this.R);}

    public double getLen() {return 2*PI*this.R;}

    public String compareTwo(Circle cirOne, Circle cirTwo){
        if(cirOne.R>cirTwo.R){return "Circle #1 is bigger\n";}
        if(cirOne.R<cirTwo.R){return "Circle #2 is bigger\n";}
        else{return "Circles r equals\n";}}

    @Override
    public String toString() {
        return "This circle stand in " +
                "("+this.x+";"+this.y+"). " +
                "It's radius is "+this.R+". " +
                "Square equals "+getSqure()+
                "\n";}
}
