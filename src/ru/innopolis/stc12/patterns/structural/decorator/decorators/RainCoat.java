package ru.innopolis.stc12.patterns.structural.decorator.decorators;

import ru.innopolis.stc12.patterns.structural.decorator.Bike;
import ru.innopolis.stc12.patterns.structural.decorator.Decorator;

public class RainCoat extends Decorator {
    private Bike bike;

    public RainCoat(Bike bike) {
        this.bike = bike;
    }

    public double cost() {
        return bike.cost() + 150;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + ", with rain coat";
    }
}
