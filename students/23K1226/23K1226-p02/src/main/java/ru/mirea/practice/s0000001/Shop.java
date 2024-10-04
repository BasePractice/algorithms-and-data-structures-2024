package ru.mirea.practice.s0000001;

class Shop implements StoreOperations {
    private String[] computers;
    private int count;

    public Shop(int size) {
        computers = new String[size];
        count = 0;
    }

    public void addComputer(String computer) {
        if (count < computers.length) {
            computers[count] = computer;
            count++;
        }
    }

    public void removeComputer(String computer) {
        for (int i = 0; i < count; i++) {
            if (computers[i].equals(computer)) {
                computers[i] = computers[count - 1];
                count--;
                break;
            }
        }
    }

    public String searchComputer(String name) {
        for (int i = 0; i < count; i++) {
            if (computers[i].equals(name)) {
                return "Найден: " + computers[i];
            }
        }
        return "Не найден";
    }
}
