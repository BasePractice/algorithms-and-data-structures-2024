package task3;

public class Software implements Nameable {
    private final String name;

    public Software(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
