package ru.innopolis.stc12.patterns.structural.decorator.bikes;

import ru.innopolis.stc12.patterns.structural.decorator.Bike;

public class PitBike extends Bike {
    public PitBike() {
        description = "Pit bike";
    }

    @Override
    public double cost() {
        return 1999.99;
    }
}
