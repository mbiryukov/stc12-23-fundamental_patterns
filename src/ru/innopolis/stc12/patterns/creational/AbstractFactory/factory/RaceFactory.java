package ru.innopolis.stc12.patterns.creational.AbstractFactory.factory;

import ru.innopolis.stc12.patterns.creational.AbstractFactory.bike.Bike;
import ru.innopolis.stc12.patterns.creational.AbstractFactory.bike.SportBike;
import ru.innopolis.stc12.patterns.creational.AbstractFactory.car.Car;
import ru.innopolis.stc12.patterns.creational.AbstractFactory.car.RaceCar;

public class RaceFactory extends Factory {
    @Override
    public Car createCar() {
        return new RaceCar();
    }

    @Override
    public Bike createBike() {
        return new SportBike();
    }
}
