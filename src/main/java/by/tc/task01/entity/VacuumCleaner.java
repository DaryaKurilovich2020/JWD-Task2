package by.tc.task01.entity;

public class VacuumCleaner extends Appliance {
    private final int POWER_CONSUMPTION;
    private final int MOTOR_SPEED_REGULATION;
    private final double CLEANING_WIDTH;
    private final String FILTER_TYPE;
    private final String BAG_TYPE;
    private final String WAND_TYPE;

    public VacuumCleaner(int POWER_CONSUMPTION, int MOTOR_SPEED_REGULATION, double CLEANING_WIDTH, String FILTER_TYPE, String BAG_TYPE, String WAND_TYPE) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
        this.CLEANING_WIDTH = CLEANING_WIDTH;
        this.FILTER_TYPE = FILTER_TYPE;
        this.BAG_TYPE = BAG_TYPE;
        this.WAND_TYPE = WAND_TYPE;
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public int getMOTOR_SPEED_REGULATION() {
        return MOTOR_SPEED_REGULATION;
    }

    public double getCLEANING_WIDTH() {
        return CLEANING_WIDTH;
    }

    public String getFILTER_TYPE() {
        return FILTER_TYPE;
    }

    public String getBAG_TYPE() {
        return BAG_TYPE;
    }

    public String getWAND_TYPE() {
        return WAND_TYPE;
    }
}

