package ru.mirea.practice.s0000001.task1;

class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("Unknown", "Unknown", 0.0);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void sendMessage(String... numbers) {
        System.out.print("Отправка сообщений на: ");
        for (String num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
}
