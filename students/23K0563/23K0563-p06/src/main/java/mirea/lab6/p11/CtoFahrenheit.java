package mirea.lab6.p11;

public class CtoFahrenheit implements Convertable {
    private float temp;

    public CtoFahrenheit(float temp) {
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
        return "Fahrenheit{" + "temp=" + '}' + temp;
    }

    @Override
    public float convert() {
        return (float) ((float) 9 / 5 * temp + 32);
    }

    @Override
    public String sym() {
        return "°F";
    }
}
