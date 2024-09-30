package ru.mirea.practice.s23k0116.format;

public class Convertor {
    private float rubValue;
    private final float usdValue;
    private final float eurValue;
    private final int curVal;
    private final float value;

    public Convertor(int curVal, float value) {
        this.curVal = curVal;
        this.value = value;
        if (curVal == 1) {
            this.rubValue = value * 1.00F;
        } else if (curVal == 2) {
            this.rubValue = value * 94.22F;
        } else if (curVal == 3) {
            this.rubValue = value * 105.26F;
        }

        this.usdValue = this.rubValue / 94.22F;
        this.eurValue = this.rubValue / 105.26F;
    }

    public int getCurVal() {
        return curVal;
    }

    public float getVal() {
        return value;
    }

    public float[] result() {
        return new float[] {this.rubValue, this.usdValue, this.eurValue};
    }
}
