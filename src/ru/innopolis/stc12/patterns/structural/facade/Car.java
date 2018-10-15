package ru.innopolis.stc12.patterns.structural.facade;

public class Car {
    String manufacturer;

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void paintBumper() {
        new CarPainterFacade().paint(manufacturer);
    }
}
