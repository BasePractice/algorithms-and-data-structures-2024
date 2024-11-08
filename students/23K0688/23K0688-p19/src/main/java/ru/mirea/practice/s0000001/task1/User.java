package ru.mirea.practice.s0000001.task1;

public class User {
    private String inn;
    private String fio;
    private String face;

    public User(String inn,String fio,String face) {
        this.inn = inn;
        this.fio = fio;
        this.face = face;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getFace() {
        return face;
    }
}
