package ru.innopolis.stc12.patterns.creational.builder.director;

import ru.innopolis.stc12.patterns.creational.builder.bikes.Types;
import ru.innopolis.stc12.patterns.creational.builder.builders.Builder;
import ru.innopolis.stc12.patterns.creational.builder.components.Engine;
import ru.innopolis.stc12.patterns.creational.builder.components.Transmission;
import ru.innopolis.stc12.patterns.creational.builder.components.TripComputer;

public class Director {
    public void constructSportBike(Builder builder) {
        builder.setType(Types.SPORT_BIKE);
        builder.setSeats(1);
        builder.setEngine(new Engine(100, 0));
        builder.setTransmittion(Transmission.MANUAL);
        builder.setTrimComputer(new TripComputer());
    }

    public void constructPitBike(Builder builder) {
        builder.setType(Types.PIT_BIKE);
        builder.setSeats(1);
        builder.setEngine(new Engine(20, 0));
        builder.setTransmittion(Transmission.SINGLE_SPEED);
        builder.setTrimComputer(new TripComputer());
    }

    public void constructDirtBike(Builder builder) {
        builder.setType(Types.DIRT_BIKE);
        builder.setSeats(2);
        builder.setEngine(new Engine(50, 0));
        builder.setTransmittion(Transmission.AUTOMATIC);
        builder.setTrimComputer(new TripComputer());
    }
}
