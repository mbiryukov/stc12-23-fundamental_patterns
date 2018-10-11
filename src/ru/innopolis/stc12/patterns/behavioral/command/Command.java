package ru.innopolis.stc12.patterns.behavioral.command;

public abstract class Command {
    public Bike bike;

    public Command(Bike bike) {
        this.bike = bike;
    }

    protected void allOn() {
        bike.setLeftFlash(true);
        bike.setRightFlash(true);
    }

    protected void allOff() {
        bike.setRightFlash(false);
        bike.setLeftFlash(false);
    }

    public abstract Boolean execute();
}
