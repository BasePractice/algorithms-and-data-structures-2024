package mirea.lab4;

public enum Seasons {
    Winter("Winter"),
    Spring("Spring"),
    Summer("Summer"),
    Autumn("Autumn");

    private int temp;
    private final String season;

    Seasons(String season) {
        this.season = season;
        switch (this.season) {
            case "Winter":
                this.temp = -10;
                break;
            case "Spring":
                this.temp = 15;
                break;
            case "Summer":
                this.temp = 20;
                break;
            case "Autumn":
                this.temp = 11;
                break;
            default:
                this.temp = 0;
                break;
        }
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getDescription() {
        if (this.season == "Winter" || this.season == "Autumn") {
            return "Холодное время года";
        } else {
            return "Тёплое время года";
        }
    }

    public String getSeason() {
        return season;
    }
}
