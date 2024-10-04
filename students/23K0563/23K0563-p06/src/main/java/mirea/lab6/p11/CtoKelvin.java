package mirea.lab6.p11;

public class CtoKelvin implements Convertable {
    private float temp;

    public CtoKelvin(float temp) {
        this.temp = temp;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Kelvin{" + "temp=" + '}' + temp;
    }

    @Override
    public float convert() {
        return (float) (temp + 272.15);
    }

    @Override
    public String sym() {
        return "°K";
    }
}
