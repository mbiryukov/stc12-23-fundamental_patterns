package ru.innopolis.stc12.patterns.structural.facade;

public class CarMechanic {
    public boolean PullOffBumper(String carName) {
        if ("Renault".equals(carName)) {
            return true;
        }
        return false;
    }
}
