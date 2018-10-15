package ru.innopolis.stc12.patterns.creational.Factory.bikes;

import ru.innopolis.stc12.patterns.creational.Factory.Bikes;

public class SportBike implements Bikes {
    @Override
    public void start() {
        System.out.println("Sport engine  started");
    }

    @Override
    public void run(Integer km) {
        System.out.println("Sport bike running " + km + " kilometres");
    }

    @Override
    public void switchOff() {
        System.out.println("Sport bike switched off");
    }
}
