package ru.innopolis.stc12.patterns.creational.Factory;

import ru.innopolis.stc12.patterns.creational.Factory.bikes.ChopperBike;
import ru.innopolis.stc12.patterns.creational.Factory.bikes.CrossBike;

public class Factory {
    public Bikes makeBike(String type) {
        switch (type) {
            case "sport":
                return new
                        ChopperBike();
            case "cross":
                return new CrossBike();
            case "chopper":
                return new ChopperBike();

        }
        return null;
    }
}
