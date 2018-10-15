package ru.innopolis.stc12.patterns.creational.AbstractFactory.factory;


import ru.innopolis.stc12.patterns.creational.AbstractFactory.bike.Bike;
import ru.innopolis.stc12.patterns.creational.AbstractFactory.car.Car;

public abstract class Factory {

    public abstract Car createCar();

    public abstract Bike createBike();
}
