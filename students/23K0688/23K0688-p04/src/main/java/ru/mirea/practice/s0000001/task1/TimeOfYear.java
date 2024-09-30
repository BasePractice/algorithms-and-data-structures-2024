package ru.mirea.practice.s0000001.task1;

public enum TimeOfYear {
    Winter(-30.2,"winter"),
    Spring(15.5,"spring"),
    Summer(30.2,"summer") {
        @Override
        public void getDescription() {
            System.out.println("pretty hot");
        }
    },
    Fall(-15.5,"fall");

    private double temp;
    private String title;

    TimeOfYear(double temp,String title) {
        this.temp = temp;
        this.title = title;
    }

    public void say(TimeOfYear timeOfYear) {
        switch (timeOfYear) {
            case Winter:
                System.out.println("Good Winter");
                break;
            case Spring:
                System.out.println("Good Spring");
                break;
            case Summer:
                System.out.println("Good Summer");
                break;
            case Fall:
                System.out.println("Good Fall");
                break;
            default:
                break;
        }
    }

    public void getDescription() {
        System.out.println("pretty cold");
    }

    @Override
    public String toString() {
        return "TimeOfYear{temp in " + title + "=" + temp + "}";
    }
}

