package mirea.lab4;

public class Computer {
    private Processor proc;
    private Memory mem;
    private Monitor mon;
    private CompModel model;
    private String mboard;

    public Computer(Processor proc, Memory mem, Monitor mon, CompModel model, String mboard) {
        this.proc = proc;
        this.mem = mem;
        this.mon = mon;
        this.model = model;
        this.mboard = mboard;
    }

    public Processor getProc() {
        return proc;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public Memory getMem() {
        return mem;
    }

    public void setMem(Memory mem) {
        this.mem = mem;
    }

    public Monitor getMon() {
        return mon;
    }

    public void setMon(Monitor mon) {
        this.mon = mon;
    }

    public CompModel getModel() {
        return model;
    }

    public void setModel(CompModel model) {
        this.model = model;
    }

    public String getMboard() {
        return mboard;
    }

    public void setMboard(String mboard) {
        this.mboard = mboard;
    }

    @Override
    public String toString() {
        return "Computer{"
                + "proc="
                + proc.toString()
                + ", mem="
                + mem.toString()
                + ", mon="
                + mon.toString()
                + ", model="
                + model.toString()
                + ", mboard='"
                + mboard
                + '\''
                + '}';
    }
}
