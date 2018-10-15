package ru.innopolis.stc12.patterns.creational.AbstractFactory;

import ru.innopolis.stc12.patterns.creational.AbstractFactory.factory.OffroadFactory;
import ru.innopolis.stc12.patterns.creational.AbstractFactory.factory.RaceFactory;

public class Main {
    public static void main(String[] args) {
        TransportUser transportUser = new TransportUser(new OffroadFactory());
        transportUser.useTransport();
        System.out.println("_______");
        transportUser = new TransportUser(new RaceFactory());
        transportUser.useTransport();
    }
}
