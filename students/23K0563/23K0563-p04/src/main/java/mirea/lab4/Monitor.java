package mirea.lab4;

public class Monitor {
    private String model;
    private float size;
    private String matrixtype;
    private String resolution;
    private int refrateHz;

    public Monitor(String model, float size, String matrixtype, String resolution, int refrateHz) {
        this.model = model;
        this.size = size;
        this.matrixtype = matrixtype;
        this.resolution = resolution;
        this.refrateHz = refrateHz;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getMatrixtype() {
        return matrixtype;
    }

    public void setMatrixtype(String matrixtype) {
        this.matrixtype = matrixtype;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getRefrateHz() {
        return refrateHz;
    }

    public void setRefrateHz(int refrateHz) {
        this.refrateHz = refrateHz;
    }

    @Override
    public String toString() {
        return "Monitor{"
                + "Model='"
                + model
                + '\''
                + ", size="
                + size
                + ", matrixtype='"
                + matrixtype
                + '\''
                + ", resolution='"
                + resolution
                + '\''
                + ", refrateHz="
                + refrateHz
                + '}';
    }
}
