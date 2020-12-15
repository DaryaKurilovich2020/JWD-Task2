package by.tc.task01.entity;

public class Refrigerator extends Appliancable {
    private final int POWER_CONSUMPTION;
    private final double WEIGHT;
    private final double FREEZER_CAPACITY;
    private final double OVERALL_CAPACITY;
    private final double HEIGHT;
    private final double WIDTH;

    public Refrigerator(int POWER_CONSUMPTION, double WEIGHT, double FREEZER_CAPACITY, double OVERALL_CAPACITY, double HEIGHT, double WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }
}
