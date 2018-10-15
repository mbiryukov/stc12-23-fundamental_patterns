package ru.innopolis.stc12.patterns.structural.decorator.bikes;

import ru.innopolis.stc12.patterns.structural.decorator.Bike;

public class EnduroBike extends Bike {
    public EnduroBike() {
        description = "Enduro bike";
    }

    @Override
    public double cost() {
        return 4999.99;
    }
}
