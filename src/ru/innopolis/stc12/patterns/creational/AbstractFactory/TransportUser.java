package ru.innopolis.stc12.patterns.creational.AbstractFactory;

import ru.innopolis.stc12.patterns.creational.AbstractFactory.bike.Bike;
import ru.innopolis.stc12.patterns.creational.AbstractFactory.car.Car;
import ru.innopolis.stc12.patterns.creational.AbstractFactory.factory.Factory;


public class TransportUser {
    private Car car;
    private Bike bike;

    public TransportUser(Factory factory) {
        car = factory.createCar();
        bike = factory.createBike();
    }

    public void useTransport() {
        car.setup();
        car.wash();
        bike.race();
        bike.repair();
    }
}
