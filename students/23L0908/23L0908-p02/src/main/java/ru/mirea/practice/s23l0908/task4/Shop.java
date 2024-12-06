package ru.mirea.practice.s23l0908.task4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Computer> computers = new ArrayList<>();

    /**
     * Adds a new computer model to the shop if it does not already exist.
     *
     * @param model the model of the computer to add
     * @return true if the model was added, false if it already exists
     */
    public boolean add(String model) {
        for (Computer computer : computers) {
            if (computer.getModel().equals(model)) {
                return false;  // Model already exists
            }
        }
        computers.add(new Computer(model));
        return true;  // Model added successfully
    }

    /**
     * Deletes a computer model from the shop.
     *
     * @param model the model of the computer to delete
     * @return true if the model was deleted, false if it was not found
     */
    public boolean delete(String model) {
        for (Computer computer : computers) {
            if (computer.getModel().equals(model)) {
                computers.remove(computer);
                return true;  // Model found and deleted
            }
        }
        return false;  // Model not found
    }

    /**
     * Increases the rating of a specified computer model by 1 if it exists.
     *
     * @param model the model of the computer to rate
     */
    public void rateModel(String model) {
        for (Computer computer : computers) {
            if (computer.getModel().equals(model)) {
                computer.setRate((short) (computer.getRate() + 1));
                break;
            }
        }
    }

    /**
     * Checks if a computer model exists in the shop.
     *
     * @param model the model of the computer to find
     * @return true if the model is found, false otherwise
     */
    public boolean find(String model) {
        for (Computer computer : computers) {
            if (computer.getModel().equals(model)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a string representation of all computers in the shop.
     *
     * @return a list of all computers or a message if the shop is empty
     */
    @Override
    public String toString() {
        if (computers.isEmpty()) {
            return "Nothing to show.\n";
        }

        StringBuilder list = new StringBuilder();
        for (Computer computer : computers) {
            list.append(computer.toString()).append("\n");
        }

        return list.toString();
    }
}
