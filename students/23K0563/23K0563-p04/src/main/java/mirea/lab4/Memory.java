package mirea.lab4;

public class Memory {
    private String model;
    private String types;
    private int mhzfreq;

    public Memory(String model, String types, int mhzfreq) {
        this.model = model;
        this.types = types;
        this.mhzfreq = mhzfreq;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public int getMhzfreq() {
        return mhzfreq;
    }

    public void setMhzfreq(int mhzfreq) {
        this.mhzfreq = mhzfreq;
    }

    @Override
    public String toString() {
        return String.format("Memory{Model='%s', Type='%s', MhzFreq=%d}", model, types, mhzfreq);
    }
}
