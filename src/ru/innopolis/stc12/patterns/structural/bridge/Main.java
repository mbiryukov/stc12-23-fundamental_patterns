package ru.innopolis.stc12.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = {
                new Car(new Mechanic()),
                new Bike(new Washer())
        };

        for (Transport transport : transports) {
            transport.workWith();
        }
    }
}
