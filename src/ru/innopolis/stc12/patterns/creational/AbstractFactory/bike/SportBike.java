package ru.innopolis.stc12.patterns.creational.AbstractFactory.bike;

public class SportBike implements Bike {
    @Override
    public void repair() {
        System.out.println("Ремонтировать спортбайк");
    }

    @Override
    public void race() {
        System.out.println("Гоняться на спортбайке");
    }
}
