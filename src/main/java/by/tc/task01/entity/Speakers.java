package by.tc.task01.entity;

public class Speakers extends Appliance {
    private final int POWER_CONSUMPTION;
    private final int NUMBER_OF_SPEAKERS;
    private final double CORD_LENGTH;
    private final String FREQUENCY_RANGE;

    public Speakers(int POWER_CONSUMPTION, int NUMBER_OF_SPEAKERS, String FREQUENCY_RANGE,double CORD_LENGTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
        this.CORD_LENGTH = CORD_LENGTH;
        this.FREQUENCY_RANGE = FREQUENCY_RANGE;
    }
}
