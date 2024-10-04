package ru.mirea.practice.s23k0755;

public class Conventor {
    private float rubValue;
    private float dolValue;
    private float eurValue;
    private float yuanValue;
    int com;
    float value;

    public Conventor(int com, float value) {
        this.com = com;
        this.value = value;
        switch (com) {
            case 1:
                this.rubValue = value;
                break;
            case 2:
                this.rubValue = value * 90;
                break;
            case 3:
                this.rubValue = value * 100;
                break;
            case 4:
                this.rubValue = value * 13;
                break;
            default:
                break;
        }
        this.dolValue = rubValue / 90;
        this.eurValue = rubValue / 100;
        this.yuanValue = rubValue / 13;
    }

    public float[] recount() {
        float[] res = new float[4];
        res[0] = rubValue;
        res[1] = dolValue;
        res[2] = eurValue;
        res[3] = yuanValue;
        return res;
    }
}