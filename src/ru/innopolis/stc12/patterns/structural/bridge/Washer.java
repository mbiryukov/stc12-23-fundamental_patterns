package ru.innopolis.stc12.patterns.structural.bridge;

public class Washer implements Handler {
    @Override
    public void handle() {
        System.out.println("Washer washes transport");
    }
}
