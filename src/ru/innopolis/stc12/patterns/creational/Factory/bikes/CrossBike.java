package ru.innopolis.stc12.patterns.creational.Factory.bikes;


import ru.innopolis.stc12.patterns.creational.Factory.Bikes;

public class CrossBike implements Bikes {
    @Override
    public void start() {
        System.out.println("Cross engine  started");
    }

    @Override
    public void run(Integer km) {
        System.out.println("Cross bike running " + km + " kilometres");
    }

    @Override
    public void switchOff() {
        System.out.println("Cross bike switched off");
    }
}
