package mirea.lab9.task1;

enum Seasons {
    WINTER(0) {
        @Override
        public String getDescription() {
            return "The cold season";
        }
    },
    SPRING(1) {
        @Override
        public String getDescription() {
            return "The cold season";
        }
    },
    SUMMER(2) {
        @Override
        public String getDescription() {
            return "The warm season";
        }
    },
    AUTUMN(3) {
        @Override
        public String getDescription() {
            return "The cold season";
        }
    };

    private final String descriptionWinter = "One of the four seasons,"
            + " between autumn and spring. "
            + "The main sign of this time of "
            + "year is a steady low temperature"
            + " (below 0 degrees Celsius) in many "
            + "areas of the Earth, snow falls and "
            + "falls on the surface of the earth";
    private final String descriptionSpring = "One of the four seasons, between winter and summer."
            + " The main sign of this time of year is the appearance of "
            + "buds on trees and bushes, melting snow, an icebreaker, "
            + "and the awakening of animals.";
    private final String descriptionSummer = "One of the four seasons, "
            + " spring and autumn, which is characterized by "
            + "the highest ambient temperature, a special vivacity of nature.";
    private final String descriptionAutumn = "One of the four seasons, between summer and winter, "
            + "characterized by yellowing and leaf fall, withering of "
            + "herbaceous plants, preparation of animals for winter, "
            + "departure of migratory birds, disappearance of insects "
            + "and a decrease in temperature.";

    private final int[] meanTemperature = {-25, +8, +25, +5};
    private final int levelCode;

    Seasons(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public String getDescriptionSeason(Seasons season) {
        switch (season.toString()) {
            case "WINTER":
                return descriptionWinter;
            case "SPRING":
                return descriptionSpring;
            case "SUMMER":
                return descriptionSummer;
            default:
                return descriptionAutumn;
        }
    }

    public String  getMeanTemperature() {
        return "Средняя температура: " + meanTemperature[this.levelCode];
    }

    public void printAllSeasons() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Season: " + Seasons.values()[i] + ", mean temperature: " + meanTemperature[i]
                    + ", description: \n" + getDescriptionSeason(Seasons.values()[i]));
        }
    }

    public abstract String getDescription();
}