package com.coffee;

/**
 * Uses electricity to heat the water.
 *
 * @see Heater
 */
public class ElectricHeater implements Heater {

    /**
     * Turns the Heater on.
     *
     * Prints '~ ~ ~ heating ~ ~ ~' when called.
     */
    @Override public void on() {

    }

    /**
     * Turns the Heater off.
     */
    @Override public void off() {

    }

    /**
     * Tells us if the Heater is hot or not.
     * @return True iff the Heater is hot, false otherwise
     */
    @Override public boolean isHot() {
        return false;
    }
}
