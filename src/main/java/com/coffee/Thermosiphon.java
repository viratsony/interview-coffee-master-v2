package com.coffee;

/**
 * A Thermosiphon is a type of Pump that uses convection
 * to move water through the machine.
 *
 * This pump is active when the Heater is hot.
 *
 * @see com.coffee.Pump#pump()
 */
public class Thermosiphon implements Pump {

    /**
     * Should print '=> => pumping => =>' when the pump is active. (Heater must be hot)
     */
    @Override public void pump() {

    }
}
