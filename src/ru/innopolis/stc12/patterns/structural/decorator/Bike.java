package ru.innopolis.stc12.patterns.structural.decorator;

public abstract class Bike {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
