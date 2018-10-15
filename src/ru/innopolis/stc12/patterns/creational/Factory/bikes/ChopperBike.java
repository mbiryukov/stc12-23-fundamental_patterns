package ru.innopolis.stc12.patterns.creational.Factory.bikes;

import ru.innopolis.stc12.patterns.creational.Factory.Bikes;

public class ChopperBike implements Bikes {
    @Override
    public void start() {
        System.out.println("Chopper engine  started");
    }

    @Override
    public void run(Integer km) {
        System.out.println("Chopper bike running " + km + " kilometres");
    }

    @Override
    public void switchOff() {
        System.out.println("Chopper bike switched off");
    }
}
