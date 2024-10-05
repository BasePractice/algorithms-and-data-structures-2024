package ru.mirea.practice.s23L0908;

public enum Season {
    ЗИМА(-35) {
        public String getDescription() {
            return super.getDescription();
        }
    },
    ВЕСНА(20) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    ЛЕТО(35) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    ОСЕНЬ(10) {
        public String getDescription() {
            return super.getDescription();
        }
    };

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
