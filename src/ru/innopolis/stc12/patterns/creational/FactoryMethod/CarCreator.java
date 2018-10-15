package ru.innopolis.stc12.patterns.creational.FactoryMethod;

public class CarCreator extends TransportUser {
    @Override
    public Transport factoryMethod() {
        return new Car();
    }
}
