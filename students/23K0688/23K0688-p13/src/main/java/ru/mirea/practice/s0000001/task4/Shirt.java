package ru.mirea.practice.s0000001.task4;

public class Shirt {
    private String num;
    private String type;
    private String color;
    private String size;

    Shirt(String num,String type,String color,String size) {
        this.num = num;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public String getNum() {
        return num;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setShirt(String shirt) {
        String[] temp = shirt.split(",");
        this.num = temp[0];
        this.type = temp[1];
        this.color = temp[2];
        this.size = temp[3];
    }

    @Override
    public String toString() {
        return "Shirt: num = " + num + " , type = " + type + " , color = " + color + " , size = " + size;
    }
}
