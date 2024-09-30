package mirea.lab4;

public class Processor {
    private String model;
    private String socket;
    private int coreNum;
    private int mhzFreq;

    public Processor(String model, String socket, int coreNum, int mhzFreq) {
        this.model = model;
        this.socket = socket;
        this.coreNum = coreNum;
        this.mhzFreq = mhzFreq;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public void setCoreNum(int coreNum) {
        this.coreNum = coreNum;
    }

    public int getMhzFreq() {
        return mhzFreq;
    }

    public void setMhzFreq(int mhzFreq) {
        this.mhzFreq = mhzFreq;
    }

    @Override
    public String toString() {
        return String.format("Processor{Model='%s', Socket='%s', CoreNum=%d, MhzFreq=%d}", model, socket, coreNum, mhzFreq);
    }
}
