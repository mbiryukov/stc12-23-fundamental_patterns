package ru.innopolis.stc12.patterns.behavioral.state;

public abstract class State {
    public Bike bike;

    public State() {
    }

    public State(Bike bike) {
        this.bike = bike;
    }

    public abstract void onStart();

    public abstract void onRide();

    public abstract void onArrive();

    public abstract void onOff();

}
