package edu.eiu.fruit;

public class Pear implements IFruit {
    private static final String NAME = "Pear";
    private static final int ROLL_MULTIPLIER = 0;
    public String getName() {
        return NAME;
    }

    public int getRollMultiplier() {
        return ROLL_MULTIPLIER;
    }
}
