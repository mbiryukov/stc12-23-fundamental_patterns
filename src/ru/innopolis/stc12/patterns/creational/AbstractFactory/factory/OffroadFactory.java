package ru.innopolis.stc12.patterns.creational.AbstractFactory.factory;

import ru.innopolis.stc12.patterns.creational.AbstractFactory.bike.Bike;
import ru.innopolis.stc12.patterns.creational.AbstractFactory.bike.CrossBike;
import ru.innopolis.stc12.patterns.creational.AbstractFactory.car.Car;
import ru.innopolis.stc12.patterns.creational.AbstractFactory.car.OffroadCar;

public class OffroadFactory extends Factory {

    @Override
    public Car createCar() {
        return new OffroadCar();
    }

    @Override
    public Bike createBike() {
        return new CrossBike();
    }
}
