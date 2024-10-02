package ru.mirea.practice.s0000001.comp;

public  class Memory {
    public String nameMemory;
    public String typeMemory;
    public Double volumeMemory;// объем памяти
    public Integer hzMemory;

    public Memory(String nameMemory, String typeMemory, Double volumeMemory, Integer hzMemory) {
        this.nameMemory = nameMemory;
        this.typeMemory = typeMemory;
        this.volumeMemory = volumeMemory;
        this.hzMemory = hzMemory;
    }

    public String getnameMemory() {
        return nameMemory;
    }

    public void setnameMemory(String nameMemory) {
        this.nameMemory = nameMemory;
    }

    public String gettypeMemory() {
        return typeMemory;
    }

    public void settypeMemory(String typeMemory) {
        this.typeMemory = typeMemory;
    }

    public Double getvolumeMemory() {
        return volumeMemory;
    }

    public void setvolumeMemory(Double volumeMemory) {
        System.out.println(volumeMemory);
    }

    public Integer gethzMemory() {
        return hzMemory;
    }

    @SuppressWarnings("unused")
    public void sethzMemory(Integer hzMemory) {
        System.out.println(hzMemory);
    }

    @Override
    public String toString() {
        return "Memory{"
                + "typeMemory='" + typeMemory + '\''
                + ", volumeMemory=" + volumeMemory
                + ", hzMemory=" + hzMemory
                + '}';
    }
}
