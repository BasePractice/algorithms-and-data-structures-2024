package ru.mirea.practice.s23L0908;

enum Season {
    Summer(20) {
        public String getDescription() {
            return "Тёплое время года.";
        }
    },
    Autumn(3),
    Winter(-10),
    Spring(6);

    private int avgTemp;

    public void setAvgTemp(int newAvgTemp) {
        this.avgTemp = newAvgTemp;
    }

    public int getAvgTemp() {
        return this.avgTemp;
    }

    public String getDescription() {
        return "Холодное время года.";
    }

    Season(int avgTemp) {
        this.avgTemp = avgTemp;
    }
}
