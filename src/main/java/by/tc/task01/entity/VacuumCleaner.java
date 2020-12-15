package by.tc.task01.entity;

public class VacuumCleaner extends Appliancable {
    private final int POWER_CONSUMPTION;
    private final int MOTOR_SPEED_REGULATION;
    private final double CLEANING_WIDTH;
    private final Filter FILTER_TYPE;
    private final String BAG_TYPE;
    private final String WAND_TYPE;

    public VacuumCleaner(int POWER_CONSUMPTION, int MOTOR_SPEED_REGULATION, double CLEANING_WIDTH, Filter FILTER_TYPE, String BAG_TYPE, String WAND_TYPE) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
        this.CLEANING_WIDTH = CLEANING_WIDTH;
        this.FILTER_TYPE = FILTER_TYPE;
        this.BAG_TYPE = BAG_TYPE;
        this.WAND_TYPE = WAND_TYPE;
    }
}

enum Filter {
    A,
    B,
    C;
}
