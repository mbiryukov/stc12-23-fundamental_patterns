package ru.innopolis.stc12.patterns.structural.decorator.bikes;

import ru.innopolis.stc12.patterns.structural.decorator.Bike;

public class SportBike extends Bike {
    public SportBike() {
        description = "Sport bike";
    }

    @Override
    public double cost() {
        return 5999.99;
    }
}
