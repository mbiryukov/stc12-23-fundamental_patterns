package ru.innopolis.stc12.patterns.creational.builder;

import ru.innopolis.stc12.patterns.creational.builder.bikes.Bike;
import ru.innopolis.stc12.patterns.creational.builder.bikes.Pilot;
import ru.innopolis.stc12.patterns.creational.builder.builders.BikeBuilder;
import ru.innopolis.stc12.patterns.creational.builder.builders.PilotBuilder;
import ru.innopolis.stc12.patterns.creational.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        BikeBuilder bikeBuilder = new BikeBuilder();
        director.constructSportBike(bikeBuilder);
        Bike bike = bikeBuilder.getResult();
        System.out.println("bike built:" + bike);

        PilotBuilder pilotBuilder = new PilotBuilder();
        director.constructDirtBike(pilotBuilder);
        Pilot pilot = pilotBuilder.getResult();
        System.out.println("pilot built: " + pilot);
    }
}
