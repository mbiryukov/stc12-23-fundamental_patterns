package ru.innopolis.stc12.patterns.creational.AbstractFactory.bike;

public class CrossBike implements Bike {
    @Override
    public void repair() {
        System.out.println("Ремонтировать байк для кросса");
    }

    @Override
    public void race() {
        System.out.println("Гоняться на байке для кросса");
    }
}
