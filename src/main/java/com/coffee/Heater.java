package com.coffee;

public interface Heater {

    /**
     * Turns the Heater on.
     *
     * Prints '~ ~ ~ heating ~ ~ ~' when called.
     */
    void on();

    /**
     * Turns the Heater off.
     */
    void off();

    /**
     * Tells us if the Heater is hot or not.
     * @return True iff the Heater is hot, false otherwise
     */
    boolean isHot();
}
