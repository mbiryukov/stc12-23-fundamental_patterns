package ru.innopolis.stc12.patterns.creational.builder.components;

import ru.innopolis.stc12.patterns.creational.builder.bikes.Bike;

public class TripComputer {
    public void condition() {
        if (Engine.isStarted()) {
            System.out.println("car is started");
        } else {
            System.out.println("car id off");
        }
    }

    public void fuelLevel() {
        System.out.println("Level of fuel - " + Bike.getFuel());
    }
}
