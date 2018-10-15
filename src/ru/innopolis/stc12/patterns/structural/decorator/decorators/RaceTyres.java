package ru.innopolis.stc12.patterns.structural.decorator.decorators;

import ru.innopolis.stc12.patterns.structural.decorator.Bike;
import ru.innopolis.stc12.patterns.structural.decorator.Decorator;

public class RaceTyres extends Decorator {
    private Bike bike;

    public RaceTyres(Bike bike) {
        this.bike = bike;
    }

    public double cost() {
        return bike.cost() + 400;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + ", with race tyres";
    }
}
