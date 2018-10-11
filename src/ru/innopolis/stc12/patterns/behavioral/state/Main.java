package ru.innopolis.stc12.patterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.getState().onStart();
        bike.getState().onArrive();
        bike.getState().onRide();
        bike.getState().onOff();
        bike.getState().onArrive();
        bike.getState().onOff();
    }
}
