package ru.innopolis.stc12.patterns.creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        TransportUser[] transportUsers = {new CarCreator(), new BikeCreator()};
        for (TransportUser transportUser : transportUsers) {
            transportUser.useTransport();
        }
        TransportUser transportUser = new CarCreator();
        transportUser.useTransport();


    }
}
