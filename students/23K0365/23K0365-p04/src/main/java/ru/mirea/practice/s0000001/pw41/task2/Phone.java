package ru.mirea.practice.s0000001.pw41.task2;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this.weight = weight;
        new Phone(number,model);
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(){}

    public void recieveCall(String callerName){
        System.out.println("Call from "+callerName);
    }
    public void recieveCall(String callerName, int callerNumber){
        System.out.println("Call from "+callerName+". Phone number: "+callerNumber);
    }

    public void sendMessage(int... numbers){
        for(int i=0;i<numbers.length;i++){System.out.println(numbers[i]);}
    }


    public int getNumber() {return number;}
}
