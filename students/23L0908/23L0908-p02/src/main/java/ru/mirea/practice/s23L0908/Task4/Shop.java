package ru.mirea.practice.s23L0908.Task4;

import java.util.ArrayList;

public class Shop {private ArrayList<Computer> computers = new ArrayList<>();

    public boolean add(String model){
        boolean status = false;
        for (Computer computer : computers){
            if (computer.getModel().equals(model)){
                status = true;
                break;
            }
        }

        if (!status){
            computers.add(new Computer(model));
        }

        return !status;

    }

    public boolean delete(String model){
        boolean status = false;
        for (Computer computer : computers){
            if (computer.getModel().equals(model)){
                status = true;
                computers.remove(computer);
                break;
            }
        }
        return status;
    }

    public void rate_model(String model){
        for (Computer computer : computers){
            if (computer.getModel().equals(model)){
                computer.setRate((short) (computer.getRate() + 1));
                break;
            }
        }
    }

    public boolean find(String model){
        boolean status = false;
        for (Computer computer : computers){
            if (computer.getModel().equals(model)){
                status = true;
                break;
            }
        }
        return status;
    }

    @Override
    public String toString() {
        if (computers.isEmpty()){
            return "Nothing to show.\n";
        }

        StringBuilder list = new StringBuilder();
        for (Computer computer : computers){
            list.append(computer.toString()).append("\n");
        }

        return list.toString();
    }
}
