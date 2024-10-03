package ru.mirea.practice.s0000001.task1;

public enum TimeOfYear {
    WINTER(-30.2,"winter"),
    SPRING(15.5,"spring"),
    SUMMER(30.2,"summer") {
        @Override
        public void getDescription() {
            System.out.println("pretty hot");
        }
    },
    FALL(-15.5,"fall");

    private double temp;
    private String title;

    TimeOfYear(double temp,String title) {
        this.temp = temp;
        this.title = title;
    }

    public void say(TimeOfYear timeOfYear) {
        switch (timeOfYear) {
            case WINTER:
                System.out.println("Good Winter");
                break;
            case SPRING:
                System.out.println("Good Spring");
                break;
            case SUMMER:
                System.out.println("Good Summer");
                break;
            case FALL:
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

