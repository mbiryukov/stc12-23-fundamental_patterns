package ru.innopolis.stc12.patterns.creational.FactoryMethod;

public abstract class TransportUser {
    private Transport transport;

    public abstract Transport factoryMethod();

    public void useTransport() {
        transport = factoryMethod();
        transport.move(14);
        System.out.println("There's " + transport.getPassengers() + " passengers in transport");
    }
}
