package ru.mirea.practice.s0000001.task2;

public class Ball {
    private double x = .0;
    private double y = .0;

    public Ball(double x, double y){
        this.x=x;
        this.y=y;}

    public Ball(){
        this.x=0.0;
        this.y=0.0;}

    public double getX() {return x;}
    public double getY() {return y;}

    public void setX(double x) {
        this.x = x;}
    public void setY(double y) {
        this.y = y;}

    public void setXY(double y,double x) {
        this.y = y;
        this.x = x;}

    public void move(double yDisp,double xDisp) {
        this.y += yDisp;
        this.x += xDisp;}

    //@Override
    public String toString(int num){
        return "U've got #"+num+" a ball in: \nx:"
                +x+"; y:"+y;}
}
