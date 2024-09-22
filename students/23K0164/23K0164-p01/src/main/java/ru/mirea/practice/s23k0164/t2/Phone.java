package ru.mirea.practice.s23k0164.t2;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    /**

    public Phone() {
    }

     */

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }
    public void receiveCall(String name, String number){
        System.out.println("Звонит{" + name + "по номеру "+ number+"}");
    }

    public int getWeight() {
        return weight;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Сообщение отправлено на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
