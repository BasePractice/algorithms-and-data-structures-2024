package ru.mirea.practice.s0000001.task1;

public class Cardss {    private String type;
    private String level;


    public Cardss(String type, String level) {
        this.type = type;
        this.level = level;
    }

    public String getSuite() {
        return type;
    }

    public void setSuite(String suite) {
        this.type = suite;
    }

    public String getRank() {
        return level;
    }


    public void setRanks(String rank) {
        this.level = rank;
    }
}
