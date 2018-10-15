package ru.innopolis.stc12.patterns.structural.bridge;

public class Mechanic implements Handler {
    @Override
    public void handle() {
        System.out.println("Mechanic repairs transport");
    }
}
