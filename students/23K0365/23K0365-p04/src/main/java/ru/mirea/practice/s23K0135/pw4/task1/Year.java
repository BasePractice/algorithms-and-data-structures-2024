package ru.mirea.practice.s23K0135.pw4.task1;

public enum Year {
    SUMMER(27) {
        @Override
        public String getDestriction() {
            return "It's a WARM year's season";
        }
    },
    WINTER(-17),
    AUTUMN(14),
    SPRING(18);

    private final int f;

    Year(int f) {
        this.f = f;
    }

    public String getDestriction() {
        return "It's a COLD year's season";
    }

    public int getF() {
        return f;
    }

    public void loveSeasons() {
        for (Year x: Year.values()) {
            switch (x) {
                case SPRING:
                    System.out.println("I love spring");
                    break;
                case SUMMER:
                    System.out.println("I love summer");
                    break;
                case AUTUMN:
                    System.out.println("I love autumn");
                    break;
                case WINTER:
                    System.out.println("I love winter");
                    break;
                default: break;
            }
        }
    }
}
