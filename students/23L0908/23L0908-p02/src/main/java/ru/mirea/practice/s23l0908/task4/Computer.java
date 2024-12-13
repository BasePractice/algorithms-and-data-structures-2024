package ru.mirea.practice.s23l0908.task4;

public class Computer {
    private final String model;
    private short rate;

    /**
     * Constructs a Computer with the specified model and an initial rate of 0.
     *
     * @param model the model of the computer
     */
    public Computer(String model) {
        this.model = model;
        this.rate = 0;
    }

    /**
     * Returns the model of the computer.
     *
     * @return the model of the computer
     */
    public String getModel() {
        return model;
    }

    /**
     * Returns the rate of the computer.
     *
     * @return the rate as a short value
     */
    public short getRate() {
        return rate;
    }

    /**
     * Sets the rate for the computer.
     *
     * @param rate the new rate to set
     */
    public void setRate(short rate) {
        this.rate = rate;
    }

    /**
     * Returns a string representation of the computer.
     *
     * @return a string with model and rate information
     */
    @Override
    public String toString() {
        return "Computer {"
            + "model = " + model
            + ", rate = " + rate + "%"
            + "}";
    }
}

