package ru.innopolis.stc12.patterns.structural.bridge;

public class Car extends Transport {
    public Car(Handler handler) {
        super(handler);
    }

    @Override
    public void workWith() {
        System.out.println("Started working with car");
        handler.handle();
    }
}
